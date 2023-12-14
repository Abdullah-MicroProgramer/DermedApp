package com.example.dermedapp.Utills;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class FireRef {
    public static DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
    public static FirebaseStorage storage = FirebaseStorage.getInstance();
    public static StorageReference storageRef = storage.getReference();

    //fireStorage ref
    public static CollectionReference VERSION = FirebaseFirestore.getInstance().collection(Constants.KEY_VERSION);
    public static CollectionReference USERS = FirebaseFirestore.getInstance().collection(Constants.KEY_REF_USERS);
    public static CollectionReference SELECTEDCAGEORY = FirebaseFirestore.getInstance().collection(Constants.KEY_SELECTED_CAREGORY);
    public static CollectionReference JOBSREQUEST = FirebaseFirestore.getInstance().collection(Constants.KEY_JOB_REQUEST);
    public static CollectionReference HELP = FirebaseFirestore.getInstance().collection(Constants.KEY_HELP);
    //storage ref
    public static  StorageReference ref = storageRef.child("user/");
}
