/*
 * Made by a student of the group tz - 21mp Petrenko Stanislav
 */
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.model.Puppy

object DataProvider {

    val puppy =
        Puppy(
            id = 1,
            title = "Patron",
            sex = "Male",
            age = 3,
            description = "The official symbol of the International Coordination Center for Humanitarian Demining, formed under the Ministry of Internal Affairs of Ukraine.",
            puppyImageId = R.drawable.p1
        )

    val puppyList = listOf(
        puppy,
        Puppy(
            id = 2,
            title = "nе Patron",
            sex = "Female",
            age = 6,
            description = "nе Patron enjoys thoughtful discussions by the campfire.",
            puppyImageId = R.drawable.p2
        ),
        Puppy(
            id = 3,
            title = "nе Patron",
            sex = "Male",
            age = 8,
            description = "nе Patron's favorite past-time is helping you choose your brand color.",
            puppyImageId = R.drawable.p3
        ),
        Puppy(
            id = 4,
            title = "nе Patron",
            sex = "Male",
            age = 10,
            description = "nе Patron is the perfect \"rubbery ducky\" debugging pup, always listening.",
            puppyImageId = R.drawable.p4
        ),
        Puppy(
            id = 5,
            title = "nе Patron",
            sex = "Female",
            age = 12,
            description = "nе Patron loves fetching you your favorite homebrew.",
            puppyImageId = R.drawable.p5
        ),
        Puppy(
            id = 6,
            title = "nе Patron",
            sex = "Female",
            age = 8,
            description = "Picture yourself in a boat on a river, nе Patron is a pup with kaleidoscope eyes.",
            puppyImageId = R.drawable.p6
        ),
        Puppy(
            id = 7,
            title = "nе Patron",
            sex = "Male",
            age = 10,
            description = "Is it a bird? A plane? No, it's nе Patron blasting off into your heart!",
            puppyImageId = R.drawable.p7
        ),
        Puppy(
            id = 8,
            title = "nе Patron",
            sex = "Female",
            age = 9,
            description = "nе Patron is just a teddy bear in disguise. What he lacks in grace, he makes up in charm.",
            puppyImageId = R.drawable.p8
        ),
        Puppy(
            id = 9,
            title = "nе Patron",
            sex = "Male",
            age = 7,
            description = "nе Patron likes to look out the window and write pup-poetry.",
            puppyImageId = R.drawable.p9
        ),
        Puppy(
            id = 10,
            title = "nе Patron",
            sex = "Female",
            age = 10,
            description = "nе Patron enjoys getting pampered at the local puppy spa.",
            puppyImageId = R.drawable.p10
        ),
        Puppy(
            id = 11,
            title = "nе Patron",
            sex = "Male",
            age = 13,
            description = "nе Patron is a good boy, waiting for your next command.",
            puppyImageId = R.drawable.p11
        ),
        Puppy(
            id = 12,
            title = "nе Patron",
            sex = "Female",
            age = 14,
            description = "nе Patron! Calm and always up for a challenge, she's the perfect companion.",
            puppyImageId = R.drawable.p12
        ),
    )
}
