package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class e extends DataSetObservable
{
  static final String LOG_TAG = e.class.getSimpleName();
  private static final Object ael = new Object();
  private static final Map<String, e> aem = new HashMap();
  final Object aen;
  final List<e.a> aeo;
  private final List<e.c> aep;
  final String aeq;
  private e.b aer;
  private int aes;
  boolean aet;
  private boolean aeu;
  private boolean aev;
  private boolean aew;
  private e.d aex;
  final Context mContext;
  private Intent mIntent;

  private void hi()
  {
    if (!this.aeu)
      throw new IllegalStateException("No preceding call to #readHistoricalData");
    if (!this.aev);
    while (true)
    {
      return;
      this.aev = false;
      if (!TextUtils.isEmpty(this.aeq))
        new e.e(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] { new ArrayList(this.aep), this.aeq });
    }
  }

  private boolean hk()
  {
    if ((this.aer != null) && (this.mIntent != null) && (!this.aeo.isEmpty()) && (!this.aep.isEmpty()))
      Collections.unmodifiableList(this.aep);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean hl()
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (this.aew)
    {
      bool2 = bool1;
      if (this.mIntent != null)
      {
        this.aew = false;
        this.aeo.clear();
        List localList = this.mContext.getPackageManager().queryIntentActivities(this.mIntent, 0);
        int i = localList.size();
        for (int j = 0; j < i; j++)
        {
          ResolveInfo localResolveInfo = (ResolveInfo)localList.get(j);
          this.aeo.add(new e.a(localResolveInfo));
        }
        bool2 = true;
      }
    }
    return bool2;
  }

  private boolean hm()
  {
    boolean bool = true;
    if ((this.aet) && (this.aev) && (!TextUtils.isEmpty(this.aeq)))
    {
      this.aet = false;
      this.aeu = true;
      ho();
    }
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private void hn()
  {
    int i = this.aep.size() - this.aes;
    if (i <= 0);
    while (true)
    {
      return;
      this.aev = true;
      for (int j = 0; j < i; j++)
        this.aep.remove(0);
    }
  }

  // ERROR //
  private void ho()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 132	android/support/v7/widget/e:mContext	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 80	android/support/v7/widget/e:aeq	Ljava/lang/String;
    //   8: invokevirtual 183	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_1
    //   12: invokestatic 189	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore_2
    //   16: aload_2
    //   17: aload_1
    //   18: ldc 191
    //   20: invokeinterface 197 3 0
    //   25: iconst_0
    //   26: istore_3
    //   27: iload_3
    //   28: iconst_1
    //   29: if_icmpeq +18 -> 47
    //   32: iload_3
    //   33: iconst_2
    //   34: if_icmpeq +13 -> 47
    //   37: aload_2
    //   38: invokeinterface 200 1 0
    //   43: istore_3
    //   44: goto -17 -> 27
    //   47: ldc 202
    //   49: aload_2
    //   50: invokeinterface 205 1 0
    //   55: invokevirtual 210	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   58: ifne +51 -> 109
    //   61: new 177	org/xmlpull/v1/XmlPullParserException
    //   64: astore 4
    //   66: aload 4
    //   68: ldc 212
    //   70: invokespecial 213	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   73: aload 4
    //   75: athrow
    //   76: astore 4
    //   78: new 215	java/lang/StringBuilder
    //   81: astore 4
    //   83: aload 4
    //   85: ldc 217
    //   87: invokespecial 218	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   90: aload 4
    //   92: aload_0
    //   93: getfield 80	android/support/v7/widget/e:aeq	Ljava/lang/String;
    //   96: invokevirtual 222	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: aload_1
    //   101: ifnull +7 -> 108
    //   104: aload_1
    //   105: invokevirtual 227	java/io/FileInputStream:close	()V
    //   108: return
    //   109: aload_0
    //   110: getfield 99	android/support/v7/widget/e:aep	Ljava/util/List;
    //   113: astore 5
    //   115: aload 5
    //   117: invokeinterface 130 1 0
    //   122: aload_2
    //   123: invokeinterface 200 1 0
    //   128: istore_3
    //   129: iload_3
    //   130: iconst_1
    //   131: if_icmpeq +162 -> 293
    //   134: iload_3
    //   135: iconst_3
    //   136: if_icmpeq -14 -> 122
    //   139: iload_3
    //   140: iconst_4
    //   141: if_icmpeq -19 -> 122
    //   144: ldc 229
    //   146: aload_2
    //   147: invokeinterface 205 1 0
    //   152: invokevirtual 210	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   155: ifne +57 -> 212
    //   158: new 177	org/xmlpull/v1/XmlPullParserException
    //   161: astore 4
    //   163: aload 4
    //   165: ldc 231
    //   167: invokespecial 213	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   170: aload 4
    //   172: athrow
    //   173: astore 4
    //   175: new 215	java/lang/StringBuilder
    //   178: astore 4
    //   180: aload 4
    //   182: ldc 217
    //   184: invokespecial 218	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   187: aload 4
    //   189: aload_0
    //   190: getfield 80	android/support/v7/widget/e:aeq	Ljava/lang/String;
    //   193: invokevirtual 222	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: pop
    //   197: aload_1
    //   198: ifnull -90 -> 108
    //   201: aload_1
    //   202: invokevirtual 227	java/io/FileInputStream:close	()V
    //   205: goto -97 -> 108
    //   208: astore_1
    //   209: goto -101 -> 108
    //   212: aload_2
    //   213: aconst_null
    //   214: ldc 233
    //   216: invokeinterface 237 3 0
    //   221: astore 6
    //   223: aload_2
    //   224: aconst_null
    //   225: ldc 239
    //   227: invokeinterface 237 3 0
    //   232: invokestatic 245	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   235: lstore 7
    //   237: aload_2
    //   238: aconst_null
    //   239: ldc 247
    //   241: invokeinterface 237 3 0
    //   246: invokestatic 253	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   249: fstore 9
    //   251: new 10	android/support/v7/widget/e$c
    //   254: astore 4
    //   256: aload 4
    //   258: aload 6
    //   260: lload 7
    //   262: fload 9
    //   264: invokespecial 256	android/support/v7/widget/e$c:<init>	(Ljava/lang/String;JF)V
    //   267: aload 5
    //   269: aload 4
    //   271: invokeinterface 161 2 0
    //   276: pop
    //   277: goto -155 -> 122
    //   280: astore 4
    //   282: aload_1
    //   283: ifnull +7 -> 290
    //   286: aload_1
    //   287: invokevirtual 227	java/io/FileInputStream:close	()V
    //   290: aload 4
    //   292: athrow
    //   293: aload_1
    //   294: ifnull -186 -> 108
    //   297: aload_1
    //   298: invokevirtual 227	java/io/FileInputStream:close	()V
    //   301: goto -193 -> 108
    //   304: astore_1
    //   305: goto -197 -> 108
    //   308: astore_1
    //   309: goto -201 -> 108
    //   312: astore_1
    //   313: goto -23 -> 290
    //   316: astore_1
    //   317: goto -209 -> 108
    //
    // Exception table:
    //   from	to	target	type
    //   12	25	76	org/xmlpull/v1/XmlPullParserException
    //   37	44	76	org/xmlpull/v1/XmlPullParserException
    //   47	76	76	org/xmlpull/v1/XmlPullParserException
    //   109	122	76	org/xmlpull/v1/XmlPullParserException
    //   122	129	76	org/xmlpull/v1/XmlPullParserException
    //   144	173	76	org/xmlpull/v1/XmlPullParserException
    //   212	277	76	org/xmlpull/v1/XmlPullParserException
    //   12	25	173	java/io/IOException
    //   37	44	173	java/io/IOException
    //   47	76	173	java/io/IOException
    //   109	122	173	java/io/IOException
    //   122	129	173	java/io/IOException
    //   144	173	173	java/io/IOException
    //   212	277	173	java/io/IOException
    //   201	205	208	java/io/IOException
    //   12	25	280	finally
    //   37	44	280	finally
    //   47	76	280	finally
    //   78	100	280	finally
    //   109	122	280	finally
    //   122	129	280	finally
    //   144	173	280	finally
    //   175	197	280	finally
    //   212	277	280	finally
    //   297	301	304	java/io/IOException
    //   104	108	308	java/io/IOException
    //   286	290	312	java/io/IOException
    //   0	12	316	java/io/FileNotFoundException
  }

  public final int a(ResolveInfo paramResolveInfo)
  {
    synchronized (this.aen)
    {
      hj();
      List localList = this.aeo;
      int i = localList.size();
      for (int j = 0; j < i; j++)
        if (((e.a)localList.get(j)).resolveInfo == paramResolveInfo)
          return j;
      j = -1;
    }
  }

  final boolean a(e.c paramc)
  {
    boolean bool = this.aep.add(paramc);
    if (bool)
    {
      this.aev = true;
      hn();
      hi();
      hk();
      notifyChanged();
    }
    return bool;
  }

  public final ResolveInfo bu(int paramInt)
  {
    synchronized (this.aen)
    {
      hj();
      ResolveInfo localResolveInfo = ((e.a)this.aeo.get(paramInt)).resolveInfo;
      return localResolveInfo;
    }
  }

  public final Intent bv(int paramInt)
  {
    synchronized (this.aen)
    {
      if (this.mIntent == null);
      ComponentName localComponentName;
      for (Object localObject2 = null; ; localObject2 = null)
      {
        return localObject2;
        hj();
        localObject2 = (e.a)this.aeo.get(paramInt);
        localComponentName = new android/content/ComponentName;
        localComponentName.<init>(((e.a)localObject2).resolveInfo.activityInfo.packageName, ((e.a)localObject2).resolveInfo.activityInfo.name);
        localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>(this.mIntent);
        ((Intent)localObject2).setComponent(localComponentName);
        if (this.aex == null)
          break;
        new Intent((Intent)localObject2);
        if (!this.aex.hp())
          break;
      }
      e.c localc = new android/support/v7/widget/e$c;
      localc.<init>(localComponentName, System.currentTimeMillis(), 1.0F);
      a(localc);
    }
  }

  public final int getHistorySize()
  {
    synchronized (this.aen)
    {
      hj();
      int i = this.aep.size();
      return i;
    }
  }

  public final int hg()
  {
    synchronized (this.aen)
    {
      hj();
      int i = this.aeo.size();
      return i;
    }
  }

  public final ResolveInfo hh()
  {
    synchronized (this.aen)
    {
      hj();
      if (!this.aeo.isEmpty())
      {
        localResolveInfo = ((e.a)this.aeo.get(0)).resolveInfo;
        return localResolveInfo;
      }
      ResolveInfo localResolveInfo = null;
    }
  }

  final void hj()
  {
    boolean bool1 = hl();
    boolean bool2 = hm();
    hn();
    if ((bool1 | bool2))
    {
      hk();
      notifyChanged();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.e
 * JD-Core Version:    0.6.2
 */