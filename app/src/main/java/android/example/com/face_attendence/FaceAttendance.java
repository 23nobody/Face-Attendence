package android.example.com.face_attendence;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class FaceAttendance extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
