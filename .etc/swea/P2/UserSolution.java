package project;

import java.util.HashMap;
import java.util.Map;

class UserSolution {
    Map<Integer, StudentInfo> db; // 학생 정보 db

    class StudentInfo {
        int mId = 0;
        int mGrade = 0;
        String mGender;
        int mScore = 0;

        public void setmId(int mId) {
            this.mId = mId;
        }

        public void setmGrade(int mGrade) {
            this.mGrade = mGrade;
        }

        public void setmGender(String mGender) {
            this.mGender = mGender;
        }

        public void setmScore(int mScore) {
            this.mScore = mScore;
        }

        public int getmId() {
            return mId;
        }

        public int getmGrade() {
            return mGrade;
        }

        public String getmGender() {
            return mGender;
        }

        public int getmScore() {
            return mScore;
        }
    } // 학생 정보

    class FindStudent {
        public int findLowestScore(Map<Integer, StudentInfo> cases) {
            int lowestStudent = 0;
            int lowestScore = Integer.MAX_VALUE;

            for (int key : cases.keySet()) {
                StudentInfo tmp = cases.get(key);
                if (tmp.getmScore() < lowestScore) {
                    lowestStudent = tmp.getmId();
                    lowestScore = tmp.getmScore();
                } else if (tmp.getmScore() == lowestScore) {
                    if (tmp.getmId() < lowestStudent) {
                        lowestStudent = tmp.getmId();
                    }
                }
            }

            return lowestStudent;
        }

        public int findHighestScore(Map<Integer, StudentInfo> cases) {
            int highestStudent = 0;
            int highestScore = Integer.MIN_VALUE;

            for (int key : cases.keySet()) {
                StudentInfo tmp = cases.get(key);
                if (tmp.getmScore() > highestScore) {
                    highestStudent = tmp.getmId();
                    highestScore = tmp.getmScore();
                } else if (tmp.getmScore() == highestScore) {
                    if (tmp.getmId() > highestStudent) {
                        highestStudent = tmp.getmId();
                    }
                }
            }

            return highestStudent;
        }

        public Map<Integer, StudentInfo> findByRange(Map<Integer, StudentInfo> cases, int score) {
            Map<Integer, StudentInfo> studentsInRange = new HashMap<>();

            for (int key : cases.keySet()) {
                StudentInfo tmp = cases.get(key);
                if (tmp.getmScore() >= score) {
                    studentsInRange.put(key, tmp);
                }
            }

            return studentsInRange;
        }// score점 이상인 학생 리스트 반환

        public Map<Integer, StudentInfo> findByGrade(Map<Integer, StudentInfo> cases, int targetGrade) {
            Map<Integer, StudentInfo> studentsInGrade = new HashMap<>();

            for (int key : cases.keySet()) {
                StudentInfo tmp = cases.get(key);
                if (tmp.getmGrade() == targetGrade) {
                    studentsInGrade.put(key, tmp);
                }
            }

            return studentsInGrade;
        }

        public Map<Integer, StudentInfo> findByGender(Map<Integer, StudentInfo> cases, String targetGender) {
            Map<Integer, StudentInfo> studentsInGender = new HashMap<>();

            for (int key : cases.keySet()) {
                StudentInfo tmp = cases.get(key);
                if (tmp.getmGender().equals(targetGender)) {
                    studentsInGender.put(key, tmp);
                }
            }

            return studentsInGender;
        }
    } // 조건에 맞는 학생 찾기

    public void init() {
        db = new HashMap<>();
        if (!db.isEmpty())
            System.exit(1);
        return;
    }

    public int add(int mId, int mGrade, char mGender[], int mScore) {
        StudentInfo student = new StudentInfo();
        FindStudent find = new FindStudent();
        student.setmId(mId);
        student.setmGrade(mGrade);
        student.setmGender(String.valueOf(mGender));
        student.setmScore(mScore);
        db.put(mId, student);

        Map<Integer, StudentInfo> tmp = find.findByGender(find.findByGrade(db, mGrade), String.valueOf(mGender));
        int highestScore = find.findHighestScore(tmp);
        return highestScore;
    }

    public int remove(int mId) {
        FindStudent find = new FindStudent();
        StudentInfo student = new StudentInfo();
        int mGrade;
        String mGender;

        if (db.containsKey(mId)) {
            student = db.get(mId);
            mGrade = student.getmGrade();
            mGender = student.getmGender();
            db.remove(mId);
        } else
            return 0;

        Map<Integer, StudentInfo> tmp = find.findByGender(find.findByGrade(db, mGrade), mGender);
        if (tmp.isEmpty())
            return 0;

        return find.findLowestScore(tmp);
    }

    public int query(int mGradeCnt, int mGrade[], int mGenderCnt, char mGender[][], int mScore) {
        FindStudent find = new FindStudent();
        Map<Integer, StudentInfo> studentsList = new HashMap<>();

        if (mGradeCnt != 3) {
            for (int i = 0; i < mGradeCnt; i++) {
                int grade = mGrade[i];
                studentsList.putAll(find.findByGrade(db, grade));
            }
        }
        else
            studentsList = db;
        
        if (mGenderCnt == 1) {
            studentsList = find.findByGender(studentsList, String.valueOf(mGender[0]));
        }

        Map<Integer, StudentInfo> tmp = find.findByRange(studentsList, mScore);
        if (!tmp.isEmpty())
            studentsList = tmp;
        else
            return 0;

        return find.findLowestScore(studentsList);
    }

    /* public void printDB(Map<Integer, StudentInfo> cases) {
        if (cases.isEmpty())
            System.out.println("데이터 없음");
        else
            System.out.println("저장된 데이터 : " + cases.size());
        for (int key : cases.keySet()) {
            StudentInfo tmp = cases.get(key);

            System.out.println("id : " + tmp.getmId());
            System.out.println("gr : " + tmp.getmGrade());
            System.out.printf("ge : %s\n", tmp.getmGender());
            System.out.println("sc : " + tmp.getmScore());
            System.out.println();
        }
    } */
}
