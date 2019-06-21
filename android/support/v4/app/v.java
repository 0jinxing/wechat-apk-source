package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.RemoteInput.Builder;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class v
{
  public static Bundle a(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 19)
      paramNotification = paramNotification.extras;
    while (true)
    {
      return paramNotification;
      if (Build.VERSION.SDK_INT >= 16)
        paramNotification = x.a(paramNotification);
      else
        paramNotification = null;
    }
  }

  public static final class a
  {
    final aa[] EB;
    final aa[] EC;
    boolean ED;
    public PendingIntent actionIntent;
    public int icon;
    final Bundle mExtras;
    public CharSequence title;

    public a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      this(paramInt, paramCharSequence, paramPendingIntent, new Bundle());
    }

    private a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle)
    {
      this.icon = paramInt;
      this.title = v.c.h(paramCharSequence);
      this.actionIntent = paramPendingIntent;
      this.mExtras = paramBundle;
      this.EB = null;
      this.EC = null;
      this.ED = true;
    }
  }

  public static final class b extends v.f
  {
    private CharSequence EE;

    public b()
    {
    }

    public b(v.c paramc)
    {
      b(paramc);
    }

    public final void a(u paramu)
    {
      if (Build.VERSION.SDK_INT >= 16)
      {
        paramu = new Notification.BigTextStyle(paramu.ds()).setBigContentTitle(this.Fx).bigText(this.EE);
        if (this.Fz)
          paramu.setSummaryText(this.Fy);
      }
    }

    public final b c(CharSequence paramCharSequence)
    {
      this.EE = v.c.h(paramCharSequence);
      return this;
    }
  }

  public static final class c
  {
    public ArrayList<v.a> EF = new ArrayList();
    CharSequence EG;
    CharSequence EH;
    public PendingIntent EI;
    PendingIntent EJ;
    RemoteViews EK;
    public Bitmap EL;
    CharSequence EM;
    int EN;
    boolean EO = true;
    boolean EP;
    v.f ER;
    CharSequence ES;
    CharSequence[] ET;
    int EU;
    int EV;
    boolean EW;
    String EX;
    boolean EY;
    String EZ;
    public boolean Fa = false;
    boolean Fb;
    boolean Fc;
    public String Fd;
    Notification Fe;
    RemoteViews Ff;
    RemoteViews Fg;
    RemoteViews Fh;
    int Fi = 0;
    String Fj;
    int Fk = 0;
    Notification Fl = new Notification();

    @Deprecated
    public ArrayList<String> Fm;
    int iZ = 0;
    public String mChannelId;
    public int mColor = 0;
    public Context mContext;
    Bundle mExtras;
    int mPriority;
    long mTimeout;

    @Deprecated
    public c(Context paramContext)
    {
      this(paramContext, null);
    }

    public c(Context paramContext, String paramString)
    {
      this.mContext = paramContext;
      this.mChannelId = paramString;
      this.Fl.when = System.currentTimeMillis();
      this.Fl.audioStreamType = -1;
      this.mPriority = 0;
      this.Fm = new ArrayList();
    }

    protected static CharSequence h(CharSequence paramCharSequence)
    {
      CharSequence localCharSequence;
      if (paramCharSequence == null)
        localCharSequence = paramCharSequence;
      while (true)
      {
        return localCharSequence;
        localCharSequence = paramCharSequence;
        if (paramCharSequence.length() > 5120)
          localCharSequence = paramCharSequence.subSequence(0, 5120);
      }
    }

    public final c a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      this.EF.add(new v.a(paramInt, paramCharSequence, paramPendingIntent));
      return this;
    }

    public final c a(PendingIntent paramPendingIntent)
    {
      this.Fl.deleteIntent = paramPendingIntent;
      return this;
    }

    public final c a(v.e parame)
    {
      parame.a(this);
      return this;
    }

    public final c a(v.f paramf)
    {
      if (this.ER != paramf)
      {
        this.ER = paramf;
        if (this.ER != null)
          this.ER.b(this);
      }
      return this;
    }

    public final c a(RemoteViews paramRemoteViews)
    {
      this.Fl.contentView = paramRemoteViews;
      return this;
    }

    public final c a(long[] paramArrayOfLong)
    {
      this.Fl.vibrate = paramArrayOfLong;
      return this;
    }

    public final c as(int paramInt)
    {
      this.Fl.icon = paramInt;
      return this;
    }

    public final c at(int paramInt)
    {
      this.Fl.defaults = paramInt;
      if ((paramInt & 0x4) != 0)
      {
        Notification localNotification = this.Fl;
        localNotification.flags |= 1;
      }
      return this;
    }

    public final c b(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      this.EU = paramInt1;
      this.EV = paramInt2;
      this.EW = paramBoolean;
      return this;
    }

    public final c b(Uri paramUri)
    {
      this.Fl.sound = paramUri;
      this.Fl.audioStreamType = -1;
      if (Build.VERSION.SDK_INT >= 21)
        this.Fl.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
      return this;
    }

    public final Notification build()
    {
      w localw = new w(this);
      v.f localf = localw.FA.ER;
      if (localf != null)
        localf.a(localw);
      Object localObject1;
      if (Build.VERSION.SDK_INT >= 26)
        localObject1 = localw.mBuilder.build();
      while (true)
      {
        if (localw.FA.Ff != null)
          ((Notification)localObject1).contentView = localw.FA.Ff;
        int i = Build.VERSION.SDK_INT;
        i = Build.VERSION.SDK_INT;
        if ((Build.VERSION.SDK_INT >= 16) && (localf != null))
          v.a((Notification)localObject1);
        return localObject1;
        Object localObject2;
        if (Build.VERSION.SDK_INT >= 24)
        {
          localObject2 = localw.mBuilder.build();
          localObject1 = localObject2;
          if (localw.Fk != 0)
          {
            if ((((Notification)localObject2).getGroup() != null) && ((((Notification)localObject2).flags & 0x200) != 0) && (localw.Fk == 2))
              w.b((Notification)localObject2);
            localObject1 = localObject2;
            if (((Notification)localObject2).getGroup() != null)
            {
              localObject1 = localObject2;
              if ((((Notification)localObject2).flags & 0x200) == 0)
              {
                localObject1 = localObject2;
                if (localw.Fk == 1)
                {
                  w.b((Notification)localObject2);
                  localObject1 = localObject2;
                }
              }
            }
          }
        }
        else if (Build.VERSION.SDK_INT >= 21)
        {
          localw.mBuilder.setExtras(localw.mExtras);
          localObject2 = localw.mBuilder.build();
          if (localw.Ff != null)
            ((Notification)localObject2).contentView = localw.Ff;
          if (localw.Fg != null)
            ((Notification)localObject2).bigContentView = localw.Fg;
          if (localw.Fh != null)
            ((Notification)localObject2).headsUpContentView = localw.Fh;
          localObject1 = localObject2;
          if (localw.Fk != 0)
          {
            if ((((Notification)localObject2).getGroup() != null) && ((((Notification)localObject2).flags & 0x200) != 0) && (localw.Fk == 2))
              w.b((Notification)localObject2);
            localObject1 = localObject2;
            if (((Notification)localObject2).getGroup() != null)
            {
              localObject1 = localObject2;
              if ((((Notification)localObject2).flags & 0x200) == 0)
              {
                localObject1 = localObject2;
                if (localw.Fk == 1)
                {
                  w.b((Notification)localObject2);
                  localObject1 = localObject2;
                }
              }
            }
          }
        }
        else if (Build.VERSION.SDK_INT >= 20)
        {
          localw.mBuilder.setExtras(localw.mExtras);
          localObject2 = localw.mBuilder.build();
          if (localw.Ff != null)
            ((Notification)localObject2).contentView = localw.Ff;
          if (localw.Fg != null)
            ((Notification)localObject2).bigContentView = localw.Fg;
          localObject1 = localObject2;
          if (localw.Fk != 0)
          {
            if ((((Notification)localObject2).getGroup() != null) && ((((Notification)localObject2).flags & 0x200) != 0) && (localw.Fk == 2))
              w.b((Notification)localObject2);
            localObject1 = localObject2;
            if (((Notification)localObject2).getGroup() != null)
            {
              localObject1 = localObject2;
              if ((((Notification)localObject2).flags & 0x200) == 0)
              {
                localObject1 = localObject2;
                if (localw.Fk == 1)
                {
                  w.b((Notification)localObject2);
                  localObject1 = localObject2;
                }
              }
            }
          }
        }
        else if (Build.VERSION.SDK_INT >= 19)
        {
          localObject1 = x.i(localw.FB);
          if (localObject1 != null)
            localw.mExtras.putSparseParcelableArray("android.support.actionExtras", (SparseArray)localObject1);
          localw.mBuilder.setExtras(localw.mExtras);
          localObject2 = localw.mBuilder.build();
          if (localw.Ff != null)
            ((Notification)localObject2).contentView = localw.Ff;
          localObject1 = localObject2;
          if (localw.Fg != null)
          {
            ((Notification)localObject2).bigContentView = localw.Fg;
            localObject1 = localObject2;
          }
        }
        else if (Build.VERSION.SDK_INT >= 16)
        {
          localObject1 = localw.mBuilder.build();
          Bundle localBundle1 = v.a((Notification)localObject1);
          Bundle localBundle2 = new Bundle(localw.mExtras);
          localObject2 = localw.mExtras.keySet().iterator();
          while (((Iterator)localObject2).hasNext())
          {
            String str = (String)((Iterator)localObject2).next();
            if (localBundle1.containsKey(str))
              localBundle2.remove(str);
          }
          localBundle1.putAll(localBundle2);
          localObject2 = x.i(localw.FB);
          if (localObject2 != null)
            v.a((Notification)localObject1).putSparseParcelableArray("android.support.actionExtras", (SparseArray)localObject2);
          if (localw.Ff != null)
            ((Notification)localObject1).contentView = localw.Ff;
          if (localw.Fg != null)
            ((Notification)localObject1).bigContentView = localw.Fg;
        }
        else
        {
          localObject1 = localw.mBuilder.getNotification();
        }
      }
    }

    public final c d(CharSequence paramCharSequence)
    {
      this.EG = h(paramCharSequence);
      return this;
    }

    public final c dt()
    {
      int i = 1;
      this.Fl.ledARGB = -16711936;
      this.Fl.ledOnMS = 300;
      this.Fl.ledOffMS = 1000;
      Notification localNotification;
      int k;
      if ((this.Fl.ledOnMS != 0) && (this.Fl.ledOffMS != 0))
      {
        j = 1;
        localNotification = this.Fl;
        k = this.Fl.flags;
        if (j == 0)
          break label92;
      }
      label92: for (int j = i; ; j = 0)
      {
        localNotification.flags = (k & 0xFFFFFFFE | j);
        return this;
        j = 0;
        break;
      }
    }

    public final c e(CharSequence paramCharSequence)
    {
      this.EH = h(paramCharSequence);
      return this;
    }

    public final c f(CharSequence paramCharSequence)
    {
      this.ES = h(paramCharSequence);
      return this;
    }

    public final c g(CharSequence paramCharSequence)
    {
      this.Fl.tickerText = h(paramCharSequence);
      return this;
    }

    public final c j(long paramLong)
    {
      this.Fl.when = paramLong;
      return this;
    }

    public final void k(int paramInt, boolean paramBoolean)
    {
      Notification localNotification;
      if (paramBoolean)
        localNotification = this.Fl;
      for (localNotification.flags |= paramInt; ; localNotification.flags &= (paramInt ^ 0xFFFFFFFF))
      {
        return;
        localNotification = this.Fl;
      }
    }

    public final c z(boolean paramBoolean)
    {
      k(16, paramBoolean);
      return this;
    }
  }

  public static final class d
    implements v.e
  {
    private Bitmap EL;
    public a Fn;
    private int mColor = 0;

    private static Bundle a(a parama)
    {
      int i = 0;
      Bundle localBundle1 = new Bundle();
      Bundle localBundle2 = null;
      Object localObject = localBundle2;
      if (parama.Fs != null)
      {
        localObject = localBundle2;
        if (parama.Fs.length > 1)
          localObject = parama.Fs[0];
      }
      Parcelable[] arrayOfParcelable = new Parcelable[parama.Fo.length];
      while (i < arrayOfParcelable.length)
      {
        localBundle2 = new Bundle();
        localBundle2.putString("text", parama.Fo[i]);
        localBundle2.putString("author", (String)localObject);
        arrayOfParcelable[i] = localBundle2;
        i++;
      }
      localBundle1.putParcelableArray("messages", arrayOfParcelable);
      localObject = parama.Fp;
      if (localObject != null)
        localBundle1.putParcelable("remote_input", new RemoteInput.Builder(((aa)localObject).FU).setLabel(((aa)localObject).FV).setChoices(((aa)localObject).FW).setAllowFreeFormInput(((aa)localObject).FX).addExtras(((aa)localObject).mExtras).build());
      localBundle1.putParcelable("on_reply", parama.Fq);
      localBundle1.putParcelable("on_read", parama.Fr);
      localBundle1.putStringArray("participants", parama.Fs);
      localBundle1.putLong("timestamp", parama.Ft);
      return localBundle1;
    }

    public final v.c a(v.c paramc)
    {
      if (Build.VERSION.SDK_INT < 21);
      while (true)
      {
        return paramc;
        Bundle localBundle = new Bundle();
        if (this.EL != null)
          localBundle.putParcelable("large_icon", this.EL);
        if (this.mColor != 0)
          localBundle.putInt("app_color", this.mColor);
        if (this.Fn != null)
          localBundle.putBundle("car_conversation", a(this.Fn));
        if (paramc.mExtras == null)
          paramc.mExtras = new Bundle();
        paramc.mExtras.putBundle("android.car.EXTENSIONS", localBundle);
      }
    }

    public static final class a
    {
      final String[] Fo;
      final aa Fp;
      final PendingIntent Fq;
      final PendingIntent Fr;
      final String[] Fs;
      final long Ft;

      public a(String[] paramArrayOfString1, aa paramaa, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, String[] paramArrayOfString2, long paramLong)
      {
        this.Fo = paramArrayOfString1;
        this.Fp = paramaa;
        this.Fr = paramPendingIntent2;
        this.Fq = paramPendingIntent1;
        this.Fs = paramArrayOfString2;
        this.Ft = paramLong;
      }

      public static final class a
      {
        public aa Fp;
        public PendingIntent Fq;
        public PendingIntent Fr;
        public long Ft;
        public final List<String> Fu = new ArrayList();
        public final String Fv;

        public a(String paramString)
        {
          this.Fv = paramString;
        }
      }
    }
  }

  public static abstract interface e
  {
    public abstract v.c a(v.c paramc);
  }

  public static abstract class f
  {
    protected v.c Fw;
    CharSequence Fx;
    CharSequence Fy;
    boolean Fz = false;

    public void a(u paramu)
    {
    }

    public final void b(v.c paramc)
    {
      if (this.Fw != paramc)
      {
        this.Fw = paramc;
        if (this.Fw != null)
          this.Fw.a(this);
      }
    }

    public final Notification build()
    {
      Notification localNotification = null;
      if (this.Fw != null)
        localNotification = this.Fw.build();
      return localNotification;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.v
 * JD-Core Version:    0.6.2
 */