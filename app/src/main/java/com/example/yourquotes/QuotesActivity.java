package com.example.yourquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuotesActivity extends AppCompatActivity {

    RecyclerView rcv;
    ArrayList<QuotesModelclass> quotelist = new ArrayList<>();
    String title,data;
    TextView     txttitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);
        initview();
    }

    private void initview() {

        rcv=findViewById(R.id.rcv);
        txttitle=findViewById(R.id.txttitle);


        if(getIntent() != null){
             title = getIntent().getStringExtra("category");
             txttitle.setText(title);
        }
        if (title.equals("Happy"))
        {
            QuotesModelclass m1 = new QuotesModelclass();
            m1.setQuotes(" “Happiness depends upon ourselves.”");
            quotelist.add(m1);
            QuotesModelclass m2 = new QuotesModelclass();
            m2.setQuotes("“Very little is needed to make a happy life; it is all within yourself, in your way of thinking.”");
            quotelist.add(m2);
            QuotesModelclass m3 = new QuotesModelclass();
            m3.setQuotes(" “Happiness is nothing more than good health and a bad memory.” ");
            quotelist.add(m3);
            QuotesModelclass m4 = new QuotesModelclass();
            m4.setQuotes("“The first recipe for happiness is: avoid too lengthy meditation on the past.” ");
            quotelist.add(m4);
            QuotesModelclass m5 = new QuotesModelclass();
            m5.setQuotes(" \"Success is getting what you want. Happiness is wanting what you get.\" ");
            quotelist.add(m5);
            QuotesModelclass m6 = new QuotesModelclass();
            m6.setQuotes("“Time you enjoy wasting is not wasted time.”");
            quotelist.add(m6);
            QuotesModelclass m7 = new QuotesModelclass();
            m7.setQuotes("“Love is that condition in which the happiness of another person is essential to your own.”");
            quotelist.add(m7);
            QuotesModelclass m8 = new QuotesModelclass();
            m8.setQuotes("“Take responsibility of your own happiness, never put it in other people’s hands.”");
            quotelist.add(m8);
            QuotesModelclass m9 = new QuotesModelclass();
            m9.setQuotes("Happiness is like a butterfly which, when pursued, is always beyond our grasp, but, if you will sit down quietly, may alight upon you.");
            quotelist.add(m9);
            QuotesModelclass m10 = new QuotesModelclass();
            m10.setQuotes("Happiness? That’s nothing more than good health and a poor memory.");
            quotelist.add(m10);
            QuotesModelclass m11 = new QuotesModelclass();
            m11.setQuotes("Be happy with what you want. Be excited about what you get");
            quotelist.add(m11);
            QuotesModelclass m12 = new QuotesModelclass();
            m12.setQuotes("The happiness of your life depends upon the quality of your thoughts.");
            quotelist.add(m12);
            QuotesModelclass m13 = new QuotesModelclass();
            m13.setQuotes("Happiness comes in waves. It’ll find you again.");
            quotelist.add(m13);
            QuotesModelclass m14 = new QuotesModelclass();
            m14.setQuotes("Sometimes your joy is the source of your smile, but sometimes your smile can be the source of your joy.");
            quotelist.add(m14);
            QuotesModelclass m15 = new QuotesModelclass();
            m15.setQuotes("Make Yourself a priority, Today do somethimg for yourself that will make you Smile");
            quotelist.add(m15);
        }

        if (title.equals("Sad"))
        {
            QuotesModelclass m1 = new QuotesModelclass();
            m1.setQuotes("“It’s amazing how someone can break your heart and you can still love them with all the little pieces.” ");
            quotelist.add(m1);
            QuotesModelclass m2 = new QuotesModelclass();
            m2.setQuotes("“Never feel regret for your own decisions. If, you will not respect your own decisions, who else will?”");
            quotelist.add(m2);
            QuotesModelclass m3 = new QuotesModelclass();
            m3.setQuotes("“I always like walking in the rain, so no one can see me crying.” ");
            quotelist.add(m3);
            QuotesModelclass m4 = new QuotesModelclass();
            m4.setQuotes("“Sadness flies away on the wings of time.” ");
            quotelist.add(m4);
            QuotesModelclass m5 = new QuotesModelclass();
            m5.setQuotes(" “Be strong now because things will get better. It might be stormy now, but it can’t rain forever” ");
            quotelist.add(m5);
            QuotesModelclass m6 = new QuotesModelclass();
            m6.setQuotes("“Maybe we all have darkness inside of us and some of us are better at dealing with it than others.”");
            quotelist.add(m6);
            QuotesModelclass m7 = new QuotesModelclass();
            m7.setQuotes("“Don’t cry because it’s over, smile because it happened.”");
            quotelist.add(m7);
            QuotesModelclass m8 = new QuotesModelclass();
            m8.setQuotes("“Your silence hurt me more than your words.”");
            quotelist.add(m8);
            QuotesModelclass m9 = new QuotesModelclass();
            m9.setQuotes("“Tears come from the heart and not from the brain.”");
            quotelist.add(m9);
            QuotesModelclass m10 = new QuotesModelclass();
            m10.setQuotes("“Heavy hearts, like heavy clouds in the sky, are best relieved by the letting of a little water.”");
            quotelist.add(m10);
            QuotesModelclass m11 = new QuotesModelclass();
            m11.setQuotes("“When you’re happy, you enjoy the music but when you’re sad, you understand the lyrics.” ");
            quotelist.add(m11);
            QuotesModelclass m12 = new QuotesModelclass();
            m12.setQuotes("“People cry, not because they are weak. It is because they’ve been strong for too long.”");
            quotelist.add(m12);
            QuotesModelclass m13 = new QuotesModelclass();
            m13.setQuotes("“You cannot protect yourself from sadness without protecting yourself from happiness.”");
            quotelist.add(m13);
            QuotesModelclass m14 = new QuotesModelclass();
            m14.setQuotes("The sky cries for those filled with sadness.");
            quotelist.add(m14);
            QuotesModelclass m15 = new QuotesModelclass();
            m15.setQuotes("There are moments when I wish I could roll back the clock and take all the sadness away, but I have the feeling that if I did, the joy would be gone as well.");
            quotelist.add(m15);
        }

        if (title.equals("Attitude"))
        {
            QuotesModelclass m1 = new QuotesModelclass();
            m1.setQuotes("Attitude is a little thing that makes a big difference.");
            quotelist.add(m1);
            QuotesModelclass m2 = new QuotesModelclass();
            m2.setQuotes("For success, attitude is equally as important as ability");
            quotelist.add(m2);
            QuotesModelclass m3 = new QuotesModelclass();
            m3.setQuotes("  Character is the result of two things: mental attitude and the way we spend our time.");
            quotelist.add(m3);
            QuotesModelclass m4 = new QuotesModelclass();
            m4.setQuotes("The attitude is very important. Because, your behavior radiates how you feel.");
            quotelist.add(m4);
            QuotesModelclass m5 = new QuotesModelclass();
            m5.setQuotes(" The ideal attitude is to be physically loose and mentally tight.");
            quotelist.add(m5);
            QuotesModelclass m6 = new QuotesModelclass();
            m6.setQuotes("Ability is what you're capable of doing. Motivation determines what you do. Attitude determines how well you do it.");
            quotelist.add(m6);
            QuotesModelclass m7 = new QuotesModelclass();
            m7.setQuotes("A positive attitude causes a chain reaction of positive thoughts, events and outcomes. It is a catalyst and it sparks extraordinary results.");
            quotelist.add(m7);
            QuotesModelclass m8 = new QuotesModelclass();
            m8.setQuotes("A positive attitude can really make dreams come true - it did for me.");
            quotelist.add(m8);
            QuotesModelclass m9 = new QuotesModelclass();
            m9.setQuotes("“Look on every exit as being an entrance somewhere else.”");
            quotelist.add(m9);
            QuotesModelclass m10 = new QuotesModelclass();
            m10.setQuotes("“When you take control of your attitude, you take control of your life.”\n");
            quotelist.add(m10);
            QuotesModelclass m11 = new QuotesModelclass();
            m11.setQuotes("Be an independent thinker at all times, and ignore anyone who attempts to define you in a limiting way.");
            quotelist.add(m11);
            QuotesModelclass m12 = new QuotesModelclass();
            m12.setQuotes("Treat me well and I’ll double the favor.");
            quotelist.add(m12);
            QuotesModelclass m13 = new QuotesModelclass();
            m13.setQuotes("Good is not good enough. I deserve more and that’s greatness.\n");
            quotelist.add(m13);
            QuotesModelclass m14 = new QuotesModelclass();
            m14.setQuotes("I don’t compare myself with others. I know I am the best in my own way.\n");
            quotelist.add(m14);
            QuotesModelclass m15 = new QuotesModelclass();
            m15.setQuotes("My attitude is a virus that’s well worth catching.\n");
            quotelist.add(m15);
        }

        if (title.equals("Angry"))
        {
            QuotesModelclass m1 = new QuotesModelclass();
            m1.setQuotes(" “Bitterness is like cancer. It eats upon the host. But anger is like fire. It burns it all clean.”");
            quotelist.add(m1);
            QuotesModelclass m2 = new QuotesModelclass();
            m2.setQuotes("“I want to commit the murder I was imprisoned for.”");
            quotelist.add(m2);
            QuotesModelclass m3 = new QuotesModelclass();
            m3.setQuotes(" “Speak when you are angry and you will make the best speech you will ever regret.” ");
            quotelist.add(m3);
            QuotesModelclass m4 = new QuotesModelclass();
            m4.setQuotes(" “Anger is an acid that can do more harm to the vessel in which it is stored than to anything on which it is poured.”\n");
            quotelist.add(m4);
            QuotesModelclass m5 = new QuotesModelclass();
            m5.setQuotes(" “Most misunderstandings in the world could be avoided if people would simply take the time to ask, \"What else could this mean?” ");
            quotelist.add(m5);
            QuotesModelclass m6 = new QuotesModelclass();
            m6.setQuotes("“It is wise to direct your anger towards problems -- not people; to focus your energies on answers -- not excuses.”\n");
            quotelist.add(m6);
            QuotesModelclass m7 = new QuotesModelclass();
            m7.setQuotes("“Usually when people are sad, they don't do anything. They just cry over their condition. But when they get angry, they bring about a change.”");
            quotelist.add(m7);
            QuotesModelclass m8 = new QuotesModelclass();
            m8.setQuotes("“Never respond to an angry person with a fiery comeback, even if he deserves it...Don't allow his anger to become your anger.”");
            quotelist.add(m8);
            QuotesModelclass m9 = new QuotesModelclass();
            m9.setQuotes("“A heart filled with anger has no room for love.");
            quotelist.add(m9);
            QuotesModelclass m10 = new QuotesModelclass();
            m10.setQuotes(" “Anger is like a storm rising up from the bottom of your consciousness. When you feel it coming, turn your focus to your breath.” ");
            quotelist.add(m10);
            QuotesModelclass m11 = new QuotesModelclass();
            m11.setQuotes("“Anger is the feeling that makes your mouth work faster than your mind.”");
            quotelist.add(m11);
            QuotesModelclass m12 = new QuotesModelclass();
            m12.setQuotes("Angry people are not always wise.");
            quotelist.add(m12);
            QuotesModelclass m13 = new QuotesModelclass();
            m13.setQuotes("“For every minute you remain angry, you give up sixty seconds of peace of mind.”");
            quotelist.add(m13);
            QuotesModelclass m14 = new QuotesModelclass();
            m14.setQuotes("“Do not be quickly provoked in your spirit, for anger resides in the lap of fools.”");
            quotelist.add(m14);
            QuotesModelclass m15 = new QuotesModelclass();
            m15.setQuotes(" “You will not be punished for your anger, you will be punished by your anger.”");
            quotelist.add(m15);
        }

        if (title.equals("Friendship"))
        {
            QuotesModelclass m1 = new QuotesModelclass();
            m1.setQuotes("“Friendship is the hardest thing in the world to explain. It’s not something you learn in school. But if you haven’t learned the meaning of friendship, you really haven’t learned anything.” ");
            quotelist.add(m1);
            QuotesModelclass m2 = new QuotesModelclass();
            m2.setQuotes("“The most beautiful discovery true friends make is that they can grow separately without growing apart.” ");
            quotelist.add(m2);
            QuotesModelclass m3 = new QuotesModelclass();
            m3.setQuotes("“Happiness can be found even in the darkest of times, if one only remembers to turn on the light.”  ");
            quotelist.add(m3);
            QuotesModelclass m4 = new QuotesModelclass();
            m4.setQuotes("“A real friend is one who walks in when the rest of the world walks out.”");
            quotelist.add(m4);
            QuotesModelclass m5 = new QuotesModelclass();
            m5.setQuotes("“There is nothing like puking with somebody to make you into old friends.” ");
            quotelist.add(m5);
            QuotesModelclass m6 = new QuotesModelclass();
            m6.setQuotes("“Life is an awful, ugly place to not have a best friend.”");
            quotelist.add(m6);
            QuotesModelclass m7 = new QuotesModelclass();
            m7.setQuotes("“If you have good friends, no matter how much life is sucking , they can make you laugh.”");
            quotelist.add(m7);
            QuotesModelclass m8 = new QuotesModelclass();
            m8.setQuotes("“Friendship is always a sweet responsibility, never an opportunity.”");
            quotelist.add(m8);
            QuotesModelclass m9 = new QuotesModelclass();
            m9.setQuotes("“A friend is someone with whom you dare to be yourself.”");
            quotelist.add(m9);
            QuotesModelclass m10 = new QuotesModelclass();
            m10.setQuotes("“Friendship marks a life even more deeply than love. Love risks degenerating into obsession, friendship is never anything but sharing.”");
            quotelist.add(m10);
            QuotesModelclass m11 = new QuotesModelclass();
            m11.setQuotes("“Your friends will know you better in the first minute you meet than your acquaintances will know you in a thousand years.”");
            quotelist.add(m11);
            QuotesModelclass m12 = new QuotesModelclass();
            m12.setQuotes("“When friendships are real, they are not glass threads or frost work, but the solidest things we can know.”" );
            quotelist.add(m12);
            QuotesModelclass m13 = new QuotesModelclass();
            m13.setQuotes("\"My best friend is the one who brings out the best in me.\" ");
            quotelist.add(m13);
            QuotesModelclass m14 = new QuotesModelclass();
            m14.setQuotes("\"Friendship is the only cement that will ever hold the world together.\" ");
            quotelist.add(m14);
            QuotesModelclass m15 = new QuotesModelclass();
            m15.setQuotes("\"A day without a friend is like a pot without a single drop of honey left inside.\"");
            quotelist.add(m15);
        }

        if (title.equals("Love"))
        {
            QuotesModelclass m1 = new QuotesModelclass();
            m1.setQuotes("“As he read, I fell in love the way you fall asleep: slowly, and then all at once.”");
            quotelist.add(m1);
            QuotesModelclass m2 = new QuotesModelclass();
            m2.setQuotes("“Loved you yesterday, love you still, always have, always will.”");
            quotelist.add(m2);
            QuotesModelclass m3 = new QuotesModelclass();
            m3.setQuotes(" “I’ll be loving you, always with a love that’s true” ");
            quotelist.add(m3);
            QuotesModelclass m4 = new QuotesModelclass();
            m4.setQuotes(" “Thinking of you keeps me awake. Dreaming of you keeps me asleep. Being with you keeps me alive.” ");
            quotelist.add(m4);
            QuotesModelclass m5 = new QuotesModelclass();
            m5.setQuotes(" “I need you like a heart needs a beat.”");
            quotelist.add(m5);
            QuotesModelclass m6 = new QuotesModelclass();
            m6.setQuotes("“I swear I couldn’t love you more than I do right now, and yet I know I will tomorrow.”");
            quotelist.add(m6);
            QuotesModelclass m7 = new QuotesModelclass();
            m7.setQuotes("”I love you as certain dark things are to be loved, in secret, between the shadow and the soul.”");
            quotelist.add(m7);
            QuotesModelclass m8 = new QuotesModelclass();
            m8.setQuotes("“There is never a time or place for true love. It happens accidentally, in a heartbeat, in a single flashing, throbbing moment.”");
            quotelist.add(m8);
            QuotesModelclass m9 = new QuotesModelclass();
            m9.setQuotes("“To love is to burn, to be on fire.”");
            quotelist.add(m9);
            QuotesModelclass m10 = new QuotesModelclass();
            m10.setQuotes("“Love does not begin and end the way we seem to think it does. Love is a battle, love is a war; love is a growing up.”");
            quotelist.add(m10);
            QuotesModelclass m11 = new QuotesModelclass();
            m11.setQuotes("“Love is like the wind, you can’t see it but you can feel it.” ");
            quotelist.add(m11);
            QuotesModelclass m12 = new QuotesModelclass();
            m12.setQuotes("“Choose a job you love, and you will never have to work a day in your life.");
            quotelist.add(m12);
            QuotesModelclass m13 = new QuotesModelclass();
            m13.setQuotes("“Do what you love, and you will find the way to get it out to the world.”");
            quotelist.add(m13);
            QuotesModelclass m14 = new QuotesModelclass();
            m14.setQuotes("“The greatest thing you’ll ever learn is to love and be loved in return.”");
            quotelist.add(m14);
            QuotesModelclass m15 = new QuotesModelclass();
            m15.setQuotes("“Love is friendship on fire.”");
            quotelist.add(m15);
        }

        if (title.equals("Motivational"))
        {
            QuotesModelclass m1 = new QuotesModelclass();
            m1.setQuotes(" “All our dreams can come true, if we have the courage to pursue them.” ");
            quotelist.add(m1);
            QuotesModelclass m2 = new QuotesModelclass();
            m2.setQuotes("“The secret of getting ahead is getting started.” ");
            quotelist.add(m2);
            QuotesModelclass m3 = new QuotesModelclass();
            m3.setQuotes("“Don’t limit yourself. Many people limit themselves to what they think they can do. You can go as far as your mind lets you. What you believe, remember, you can achieve.” ");
            quotelist.add(m3);
            QuotesModelclass m4 = new QuotesModelclass();
            m4.setQuotes(" “If people are doubting how far you can go, go so far that you can’t hear them anymore.”");
            quotelist.add(m4);
            QuotesModelclass m5 = new QuotesModelclass();
            m5.setQuotes(" “Everything you can imagine is real.”");
            quotelist.add(m5);
            QuotesModelclass m6 = new QuotesModelclass();
            m6.setQuotes("“It’s no use going back to yesterday, because I was a different person then.” ");
            quotelist.add(m6);
            QuotesModelclass m7 = new QuotesModelclass();
            m7.setQuotes("“One day or day one. You decide.”");
            quotelist.add(m7);
            QuotesModelclass m8 = new QuotesModelclass();
            m8.setQuotes("“No one is to blame for your future situation but yourself. If you want to be successful, then become ‘Successful.’”");
            quotelist.add(m8);
            QuotesModelclass m9 = new QuotesModelclass();
            m9.setQuotes("“Invest in your dreams. Grind now. Shine later.” ");
            quotelist.add(m9);
            QuotesModelclass m10 = new QuotesModelclass();
            m10.setQuotes("“Greatness only comes before hustle in the dictionary.”");
            quotelist.add(m10);
            QuotesModelclass m11 = new QuotesModelclass();
            m11.setQuotes("“Invest in your dreams. Grind now. Shine later.”");
            quotelist.add(m11);
            QuotesModelclass m12 = new QuotesModelclass();
            m12.setQuotes("“Hustle in silence and let your success make the noise.”");
            quotelist.add(m12);
            QuotesModelclass m13 = new QuotesModelclass();
            m13.setQuotes("“Some people want it to happen, some wish it would happen, others make it happen.”");
            quotelist.add(m13);
            QuotesModelclass m14 = new QuotesModelclass();
            m14.setQuotes("“Great things are done by a series of small things brought together.” ");
            quotelist.add(m14);
            QuotesModelclass m15 = new QuotesModelclass();
            m15.setQuotes("“It’s not the load that breaks you down, it’s the way you carry it.”");
            quotelist.add(m15);
        }

        if (title.equals("Alone"))
        {
            QuotesModelclass m1 = new QuotesModelclass();
            m1.setQuotes(" “Loneliness is not a reality, it’s just a feeling. Convert it to SOLITUDE.” ");
            quotelist.add(m1);
            QuotesModelclass m2 = new QuotesModelclass();
            m2.setQuotes("“Alone is state of being or body, whereas loneliness is state of mind.”");
            quotelist.add(m2);
            QuotesModelclass m3 = new QuotesModelclass();
            m3.setQuotes(" “You’re only lonely if you’re not there for you.” ");
            quotelist.add(m3);
            QuotesModelclass m4 = new QuotesModelclass();
            m4.setQuotes("“If you never share your feelings with anyone, you are bound to feel lonely.”");
            quotelist.add(m4);
            QuotesModelclass m5 = new QuotesModelclass();
            m5.setQuotes(" “You never walk alone. Even the devil is the lord of flies.” ");
            quotelist.add(m5);
            QuotesModelclass m6 = new QuotesModelclass();
            m6.setQuotes("“Music was my refuge. I could crawl into the space between the notes and curl my back to loneliness.” ");
            quotelist.add(m6);
            QuotesModelclass m7 = new QuotesModelclass();
            m7.setQuotes("“Loneliness is and always has been the central and inevitable experience of every man.” ");
            quotelist.add(m7);
            QuotesModelclass m8 = new QuotesModelclass();
            m8.setQuotes("“Inside myself is a place where I live all alone, and that’s where you renew your springs that never dry up.” ");
            quotelist.add(m8);
            QuotesModelclass m9 = new QuotesModelclass();
            m9.setQuotes("“Sometimes you have to stand alone just to make sure you still can.”");
            quotelist.add(m9);
            QuotesModelclass m10 = new QuotesModelclass();
            m10.setQuotes("“There’s nothing abnormal about loneliness.”");
            quotelist.add(m10);
            QuotesModelclass m11 = new QuotesModelclass();
            m11.setQuotes("“It’s easy to stand with the crowd it takes courage to stand alone”\n");
            quotelist.add(m11);
            QuotesModelclass m12 = new QuotesModelclass();
            m12.setQuotes("“Sometimes, you need to be alone. Not to be lonely, but to enjoy your free time being yourself.”");
            quotelist.add(m12);
            QuotesModelclass m13 = new QuotesModelclass();
            m13.setQuotes("“Once you start loving your own presence, you stop chasing people in your life.” \n");
            quotelist.add(m13);
            QuotesModelclass m14 = new QuotesModelclass();
            m14.setQuotes("“Sometimes you just need to be alone and let your tears out.”\n");
            quotelist.add(m14);
            QuotesModelclass m15 = new QuotesModelclass();
            m15.setQuotes("“As I get older I’m more and more comfortable being alone.”");
            quotelist.add(m15);
        }

        if (title.equals("Best"))
        {
            QuotesModelclass m1 = new QuotesModelclass();
            m1.setQuotes(" The greatest glory in living lies not in never falling, but in rising every time we fall.");
            quotelist.add(m1);
            QuotesModelclass m2 = new QuotesModelclass();
            m2.setQuotes("The way to get started is to quit talking and begin doing.");
            quotelist.add(m2);
            QuotesModelclass m3 = new QuotesModelclass();
            m3.setQuotes("If life were predictable it would cease to be life, and be without flavor. ");
            quotelist.add(m3);
            QuotesModelclass m4 = new QuotesModelclass();
            m4.setQuotes("Life is what happens when you're busy making other plans. ");
            quotelist.add(m4);
            QuotesModelclass m5 = new QuotesModelclass();
            m5.setQuotes(" Always remember that you are absolutely unique. Just like everyone else. ");
            quotelist.add(m5);
            QuotesModelclass m6 = new QuotesModelclass();
            m6.setQuotes("The future belongs to those who believe in the beauty of their dreams. ");
            quotelist.add(m6);
            QuotesModelclass m7 = new QuotesModelclass();
            m7.setQuotes("“Great men are like eagles, and build their nest on some lofty solitude.” ");
            quotelist.add(m7);
            QuotesModelclass m8 = new QuotesModelclass();
            m8.setQuotes("Tell me and I forget. Teach me and I remember. Involve me and I learn. ");
            quotelist.add(m8);
            QuotesModelclass m9 = new QuotesModelclass();
            m9.setQuotes("Whoever is happy will make others happy too. ");
            quotelist.add(m9);
            QuotesModelclass m10 = new QuotesModelclass();
            m10.setQuotes("“If you smile when you are alone, then you really mean it.”");
            quotelist.add(m10);
            QuotesModelclass m11 = new QuotesModelclass();
            m11.setQuotes(" \"Always remember that you are absolutely unique. Just like everyone else.\" ");
            quotelist.add(m11);
            QuotesModelclass m12 = new QuotesModelclass();
            m12.setQuotes("\"The future belongs to those who believe in the beauty of their dreams.\" ");
            quotelist.add(m12);
            QuotesModelclass m13 = new QuotesModelclass();
            m13.setQuotes("Life is either a daring adventure or nothing at all.");
            quotelist.add(m13);
            QuotesModelclass m14 = new QuotesModelclass();
            m14.setQuotes("You have brains in your head. You have feet in your shoes. You can steer yourself any direction you choose");
            quotelist.add(m14);
            QuotesModelclass m15 = new QuotesModelclass();
            m15.setQuotes("The only impossible journey is the one you never begin.");
            quotelist.add(m15);
        }

        if (title.equals("Confidence"))
        {
            QuotesModelclass m1 = new QuotesModelclass();
            m1.setQuotes(" \"No one can make you feel inferior without your consent.\" ");
            quotelist.add(m1);
            QuotesModelclass m2 = new QuotesModelclass();
            m2.setQuotes("\"I can be changed by what happens to me. But I refuse to be reduced by it.\" ");
            quotelist.add(m2);
            QuotesModelclass m3 = new QuotesModelclass();
            m3.setQuotes(" Do not let what you cannot do interfere with what you can do. ");
            quotelist.add(m3);
            QuotesModelclass m4 = new QuotesModelclass();
            m4.setQuotes(" You're never as good as everyone tells you when you win, and you're never as bad as they say when you lose.");
            quotelist.add(m4);
            QuotesModelclass m5 = new QuotesModelclass();
            m5.setQuotes(" Courage is resistance to fear, mastery of fear, not absence of fear. ");
            quotelist.add(m5);
            QuotesModelclass m6 = new QuotesModelclass();
            m6.setQuotes("Sooner or later, those who win are those who think they can.");
            quotelist.add(m6);
            QuotesModelclass m7 = new QuotesModelclass();
            m7.setQuotes("Remember that wherever your heart is, there you will find your treasure.");
            quotelist.add(m7);
            QuotesModelclass m8 = new QuotesModelclass();
            m8.setQuotes("Accept who you are; and revel in it.");
            quotelist.add(m8);
            QuotesModelclass m9 = new QuotesModelclass();
            m9.setQuotes("Success is most often achieved by those who don't know that failure is inevitable.");
            quotelist.add(m9);
            QuotesModelclass m10 = new QuotesModelclass();
            m10.setQuotes("We don't see things as they are, we see them as we are.");
            quotelist.add(m10);
            QuotesModelclass m11 = new QuotesModelclass();
            m11.setQuotes("You've got to take the initiative and play your game. In a decisive set, confidence is the difference.");
            quotelist.add(m11);
            QuotesModelclass m12 = new QuotesModelclass();
            m12.setQuotes("Don't be satisfied with stories, how things have gone with others. Unfold your own myth.");
            quotelist.add(m12);
            QuotesModelclass m13 = new QuotesModelclass();
            m13.setQuotes("A successful man is one who can lay a firm foundation with the bricks others have thrown at him.");
            quotelist.add(m13);
            QuotesModelclass m14 = new QuotesModelclass();
            m14.setQuotes("Don't waste your energy trying to change opinions ... Do your thing, and don't care if they like it.");
            quotelist.add(m14);
            QuotesModelclass m15 = new QuotesModelclass();
            m15.setQuotes("It took me a long time not to judge myself through someone else's eyes.");
            quotelist.add(m15);
        }

        if (title.equals("Funny"))
        {
            QuotesModelclass m1 = new QuotesModelclass();
            m1.setQuotes(" “I'm sick of following my dreams, man. I'm just going to ask where they're going and hook up with ’em later.\"");
            quotelist.add(m1);
            QuotesModelclass m2 = new QuotesModelclass();
            m2.setQuotes("“Clothes make the man. Naked people have little or no influence in society.”");
            quotelist.add(m2);
            QuotesModelclass m3 = new QuotesModelclass();
            m3.setQuotes(" “I used to sell furniture for a living. The trouble was, it was my own.” ");
            quotelist.add(m3);
            QuotesModelclass m4 = new QuotesModelclass();
            m4.setQuotes(" “There is no sunrise so beautiful that it is worth waking me up to see it.”");
            quotelist.add(m4);
            QuotesModelclass m5 = new QuotesModelclass();
            m5.setQuotes(" “Truth hurts. Maybe not as much as jumping on a bicycle with a seat missing, but it hurts.” ");
            quotelist.add(m5);
            QuotesModelclass m6 = new QuotesModelclass();
            m6.setQuotes("“I never feel more alone than when I’m trying to put sunscreen on my back.”");
            quotelist.add(m6);
            QuotesModelclass m7 = new QuotesModelclass();
            m7.setQuotes("“I never forget a face—but in your case, I’ll be glad to make an exception.”");
            quotelist.add(m7);
            QuotesModelclass m8 = new QuotesModelclass();
            m8.setQuotes("“If you want to be sure that you never forget your wife’s birthday, just try forgetting it once.” ");
            quotelist.add(m8);
            QuotesModelclass m9 = new QuotesModelclass();
            m9.setQuotes("“Behind every great man is a woman rolling her eyes.” ");
            quotelist.add(m9);
            QuotesModelclass m10 = new QuotesModelclass();
            m10.setQuotes(" “A perfect parent is a person with excellent child-rearing theories and no actual children.”");
            quotelist.add(m10);
            QuotesModelclass m11 = new QuotesModelclass();
            m11.setQuotes("“When I was a kid my parents moved a lot, but I always found them.” ");
            quotelist.add(m11);
            QuotesModelclass m12 = new QuotesModelclass();
            m12.setQuotes(" “There is no such thing as fun for the whole family.”");
            quotelist.add(m12);
            QuotesModelclass m13 = new QuotesModelclass();
            m13.setQuotes("“Happiness is having a large, caring, close-knit family in another city.” ");
            quotelist.add(m13);
            QuotesModelclass m14 = new QuotesModelclass();
            m14.setQuotes("“Thousands of years ago, cats were worshipped as gods. Cats have never forgotten this.” ");
            quotelist.add(m14);
            QuotesModelclass m15 = new QuotesModelclass();
            m15.setQuotes("“Friends are God’s way of apologizing to us for our families.”");
            quotelist.add(m15);
        }

        QuotesInterface quotesInterface = new QuotesInterface() {
            @Override
            public void Clickcpy(String quotes) {
                Toast.makeText(QuotesActivity.this, "Copied", Toast.LENGTH_SHORT).show();
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("quote", quotes);
                clipboard.setPrimaryClip(clip);
            }

            @Override
            public void Clickshare(String quotes) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        };


        LinearLayoutManager manager = new LinearLayoutManager(QuotesActivity.this,LinearLayoutManager.VERTICAL,false);
        rcv.setLayoutManager(manager);
        QuotesAdapter adapter = new QuotesAdapter(QuotesActivity.this,quotelist,quotesInterface);
        rcv.setAdapter(adapter);
    }
}