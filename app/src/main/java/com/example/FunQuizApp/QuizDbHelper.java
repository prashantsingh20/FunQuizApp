package com.example.FunQuizApp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.FunQuizApp.QuizContract.*;

import java.util.ArrayList;

public class QuizDbHelper extends SQLiteOpenHelper {

   private static final String DATABASE_NAME = "GoQuiz.db";
   private static final int DATBASE_VERSION = 3;

    private SQLiteDatabase db;


    QuizDbHelper(Context context) {
        super(context, DATABASE_NAME,null, DATBASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUMN_QUESTION + " TEXT, " +
                QuestionTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionTable.COLUMN_ANSWER_NR + " INTEGER, " +
                QuestionTable.COLUMN_CATEGORY + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.TABLE_NAME);
        onCreate(db);

    }


    private void fillQuestionsTable()
    {

        Questions q1 = new Questions("Android is what ?","OS","Drivers","Software","Hardware",1,Questions.CATEGORY_COMPUTERS);
        addQuestions(q1);


        Questions q2 = new Questions("Full form of PC is ?","OS","Personal Computer","Pocket Computer","Hardware",2,Questions.CATEGORY_COMPUTERS);
        addQuestions(q2);


        Questions q3 = new Questions("Windows is what ?","Easy Software","Hardware Device","Operating System","Hardware",3,Questions.CATEGORY_COMPUTERS);
        addQuestions(q3);


        Questions q4 = new Questions("Unity is used for what ?","Game Development","Movie Making","Firmware","Hardware",1,Questions.CATEGORY_COMPUTERS);
        addQuestions(q4);


        Questions q5 = new Questions("RAM stands for ","Windows","Drivers","GUI","Random Access Memory",4,Questions.CATEGORY_COMPUTERS);
        addQuestions(q5);


        Questions q6 = new Questions("Chrome is what ?","OS","Browser","Tool","New Browser",2,Questions.CATEGORY_COMPUTERS);
        addQuestions(q6);

        Questions q7 = new Questions("Computer Hard Disk was first introduced in 1956 by ?","DELL","APPLE","MICROSOFT","IBM",4,Questions.CATEGORY_COMPUTERS);
        addQuestions(q7);

        Questions q8 = new Questions(" Which of the following is not a web browser ?","MOSAIC","WWW","Facebook","Opera",3,Questions.CATEGORY_COMPUTERS);
        addQuestions(q8);

        Questions q9 = new Questions("In computer world, Trojan refer to","Virus","Malware","Worm","Spyware",2,Questions.CATEGORY_COMPUTERS);
        addQuestions(q9);

        Questions q10 = new Questions("Who created the C programming Language","Ken Thompson","Dennis Ritchie","Robin Milner","Frieder Nake",2,Questions.CATEGORY_COMPUTERS);
        addQuestions(q10);

        Questions q11 = new Questions("The Battle of Plassey was fought in ?","1757","1752","1782","1800",1,Questions.CATEGORY_HISTORY);
        addQuestions(q11);

        Questions q12 = new Questions("The territory of Porus who offered strong resistance to Alexander was situated between the rivers of ?","Sutlej and Beas","Jhelum and Chenab","Ravi and Chenab","Ganga and Yamuna",2,Questions.CATEGORY_HISTORY);
        addQuestions(q12);


        Questions q13 = new Questions(
                "Under Akbar, the Mir Bakshi was required to look after ?","military affairs","the state treasury","the royal household","the land revenue system",1,Questions.CATEGORY_HISTORY);
        addQuestions(q13);


        Questions q14 = new Questions(
                "Tripitakas are sacred books of ?","Buddhists","Hindus","Jains","None of the above",1,Questions.CATEGORY_HISTORY);
        addQuestions(q14);


        Questions q15 = new Questions("The trident-shaped symbol of Buddhism does not represent ","Nirvana","Sangha","Buddha","Dhamma",1,Questions.CATEGORY_HISTORY);
        addQuestions(q15);


        Questions q16 = new Questions("The theory of economic drain of India during British imperialism was propounded by","Jawaharlal Nehru","Dadabhai Naoroji","R.C. Dutt","M.K. Gandhi",2,Questions.CATEGORY_HISTORY);
        addQuestions(q16);

        Questions q17 = new Questions(
                "The treaty of Srirangapatna was signed between Tipu Sultan and ?","Robert Clive","Cornwallis","Dalhousie","Warren Hastings",2,Questions.CATEGORY_HISTORY);
        addQuestions(q17);

        Questions q18 = new Questions(
                "The system of competitive examination for civil service was accepted in principle in the year","1833","1853","1879","1899",2,Questions.CATEGORY_HISTORY);
        addQuestions(q18);

        Questions q19 = new Questions("The Vijayanagara ruler, Kirshnadev Raya's work Amuktamalyada, was in","Telugu","Sanskrit","Tamil","Kannada",1,Questions.CATEGORY_HISTORY);
        addQuestions(q19);

        Questions q20 = new Questions(
                "Through which one of the following, the king exercised his control over villages in the Vijayanagar Empire","Dannayaka","Sumanta","Nayaka","Mahanayakacharya",4,Questions.CATEGORY_HISTORY);
        addQuestions(q20);

        Questions q21 = new Questions("Who is the villain in Guardians of the Galaxy: Vol 1 ?","Thanos"," Ronan The Accuser","Obidiah Stane","Yondu Udonta",2,Questions.CATEGORY_MATHS);
        addQuestions(q21);

        Questions q22 = new Questions("What type of scientist is Jane Foster in Thor ?","Astronomer","Biologist","Chemist","Dioptrics",1,Questions.CATEGORY_MATHS);
        addQuestions(q22);


        Questions q23 = new Questions("What is Thor's mothers name??"," Frya","Feera","Fridda","Frigga",4,Questions.CATEGORY_MATHS);
        addQuestions(q23);


        Questions q24 = new Questions("What type of vehicle did Thanos briefly use in the comic books and make a brief appearance in the Loki series??","A tank with “Infinity” written on it","A helicopter with “Thanos” written on the side"," A car with “perfectly balanced” on the side"," A motorbike with “Titan” on the side",2,Questions.CATEGORY_MATHS);
        addQuestions(q24);


        Questions q25 = new Questions("Ryan Reynolds acted in two Marvel movie series, one was the Deadpool movie series, the other was: ","Daredevil","Captain America: Winter Soldier","Blade","Guardians of the galaxy",3,Questions.CATEGORY_MATHS);
        addQuestions(q25);


        Questions q26 = new Questions("During which war did Captain America get his superhuman abilities ?","Civil War","World War I"," Worlds War II","The Cold War",3,Questions.CATEGORY_MATHS);
        addQuestions(q26);

        Questions q27 = new Questions("What is the name of Peter Quill’s home planet?","Mordor","Goddricks Hollow","Earth","Morag",3,Questions.CATEGORY_MATHS);
        addQuestions(q27);

        Questions q28 = new Questions(" Which of the following characters did not disappear during the ”blip”?","Spiderman","Black Panther","Doctor Strange","Rocket",4,Questions.CATEGORY_MATHS);
        addQuestions(q28);

        Questions q29 = new Questions("Where was Natasha Romanoff born","Germany","Russia","United States of America","Wakanda",2,Questions.CATEGORY_MATHS);
        addQuestions(q29);

        Questions q30 = new Questions("In which movie does Stan Lee appear in a library with headphones on","Ant Man and Wasp","Thor: The Dark World","Spiderman: Homecoming","The Amazing Spiderman",4,Questions.CATEGORY_MATHS);
        addQuestions(q30);

        Questions q31 = new Questions("Who is the hero of Panchatatva?","Shamanth","Prem","Prajwal Bhat","Salman Khan",3,Questions.CATEGORY_ENGLISH);
        addQuestions(q31);

        Questions q32 = new Questions("Who did Richard date among the 6 people from friends?","Monica","Rachel","Phoebe","None",1,Questions.CATEGORY_ENGLISH);
        addQuestions(q32);


        Questions q33 = new Questions("Who was responsible for the creation of the Night King? ?","The Lord of Light","The Children of the Forest","The Drowned God","The First Men",2,Questions.CATEGORY_ENGLISH);
        addQuestions(q33);


        Questions q34 = new Questions("Who had the honour of killing Petyr Baelish ?","Jon Snow","Sansa Stark","Brienne","Arya Stark",4,Questions.CATEGORY_ENGLISH);
        addQuestions(q34);


        Questions q35 = new Questions("Walt turns 50 in the very first episode. How old is he in the very last episode? ","51","52","53","54",2,Questions.CATEGORY_ENGLISH);
        addQuestions(q35);


        Questions q36 = new Questions("In Season 3,Skyler does a bit of light research by visiting which page ?","Money Laundery","Drugs","Lung Cancer","Crystal Meth",1,Questions.CATEGORY_ENGLISH);
        addQuestions(q36);

        Questions q37 = new Questions("What numbers does Seong Gi-hun use to win his horse race bet in squid game?","1,2","2,3","6,8","8,9",3,Questions.CATEGORY_ENGLISH);
        addQuestions(q37);

        Questions q38 = new Questions(" Which is not one of the mask symbols in squid game?","Triangle","Square","Circle","Cross",4,Questions.CATEGORY_ENGLISH);
        addQuestions(q38);

        Questions q39 = new Questions("When was the nuclear power plant inaugurated in Winden?","1951","1952","1953","1954",3,Questions.CATEGORY_ENGLISH);
        addQuestions(q39);

        Questions q40 = new Questions("Which character  doesn’t exist in the original world?","Torben Woller","Bernadette Woller","Ulrich Nielsen",
                "Katharina Albers",3,Questions.CATEGORY_ENGLISH);
        addQuestions(q40);

        Questions q41 = new Questions("Which of the following states sponsored India's Hockey  ?","Punjab","Odisha","Haryana","Rajasthan",2,Questions.CATEGORY_GRAPHICS);
        addQuestions(q41);

        Questions q42 = new Questions(" Which country has adopted Three Children per couple policy?","Finland","Denmarkr","Netherland","China",4,Questions.CATEGORY_GRAPHICS);
        addQuestions(q42);


        Questions q43 = new Questions("Which country launched world's largest carbon trading market ?","India","USA","China","Japan",3,Questions.CATEGORY_GRAPHICS);
        addQuestions(q43);


        Questions q44 = new Questions(" Which country emerges  top of Global Youth Index 2020 ?","Norway","Finland","Singapore","Denmark",3,Questions.CATEGORY_GRAPHICS);
        addQuestions(q44);


        Questions q45 = new Questions("Ismail Sabri Yaakob becomes the new Prime Minister of ","Malaysia","Maldives","Mauritius","Indonesia",1,Questions.CATEGORY_GRAPHICS);
        addQuestions(q45);


        Questions q46 = new Questions("India's first private LNG plant has been launched in ?","Raipur","Nagpur","Pune","Hyderabad",2,Questions.CATEGORY_GRAPHICS);
        addQuestions(q46);

        Questions q47 = new Questions("Sputnik vaccine of Corona is developed by which country ?","India","China","Russia","Canada",3,Questions.CATEGORY_GRAPHICS);
        addQuestions(q47);

        Questions q48 = new Questions(" India's rank in Global Start-up ranking 2021 is ?","19th","18th","20th","21st",3,Questions.CATEGORY_GRAPHICS);
        addQuestions(q48);

        Questions q49 = new Questions(" XXXV Olympic Games (2032) will be held in","Doha (Qatar)","Barcelona (Spain)","Brisbane (Australia)","Seoul (South Korea)",3,Questions.CATEGORY_GRAPHICS);
        addQuestions(q49);

        Questions q50 = new Questions("Which  country has adopted India's BHIM UPI","Nepal","Bhutan","Bangladesh","Srilanka",2,Questions.CATEGORY_GRAPHICS);
        addQuestions(q50);
    }

    private void addQuestions(Questions question){

        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUMN_QUESTION,question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION1,question.getOption1());
        cv.put(QuestionTable.COLUMN_OPTION2,question.getOption2());
        cv.put(QuestionTable.COLUMN_OPTION3,question.getOption3());
        cv.put(QuestionTable.COLUMN_OPTION4,question.getOption4());
        cv.put(QuestionTable.COLUMN_ANSWER_NR,question.getAnswerNr());
        cv.put(QuestionTable.COLUMN_CATEGORY,question.getCategory());
        db.insert(QuestionTable.TABLE_NAME,null,cv);

    }

    public ArrayList<Questions> getAllQuestionsWithCategory(String category) {

        ArrayList<Questions> questionList = new ArrayList<>();
        db = getReadableDatabase();



        String Projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_ANSWER_NR,
                QuestionTable.COLUMN_CATEGORY
        };

            String selection = QuestionTable.COLUMN_CATEGORY + " = ? ";
            String selectionArgs[] = {category};

            Cursor c = db.query(QuestionTable.TABLE_NAME,
                    Projection,
                    selection,
                    selectionArgs,
                    null,
                    null,
                    null);


            if (c.moveToFirst()) {
                do {

                    Questions question = new Questions();
                    question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                    question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                    question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                    question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                    question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                    question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                    question.setCategory(c.getString(c.getColumnIndex(QuestionTable.COLUMN_CATEGORY)));

                    questionList.add(question);

                } while (c.moveToNext());

            }
            c.close();
            return questionList;

        }



    public ArrayList<Questions> getAllQuestions() {

        ArrayList<Questions> questionList = new ArrayList<>();
        db = getReadableDatabase();



        String Projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_ANSWER_NR
        };



        Cursor c = db.query(QuestionTable.TABLE_NAME,
                Projection,
                null,
                null,
                null,
                null,
                null);


        if (c.moveToFirst()) {
            do {

                Questions question = new Questions();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));

                questionList.add(question);

            } while (c.moveToNext());

        }
        c.close();
        return questionList;

    }

    }


