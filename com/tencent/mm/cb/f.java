package com.tencent.mm.cb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.plugin.emoji.b.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.SmileyInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class f
{
  private static volatile f xGd;
  public static Pattern xGo;
  private static final Comparator<a> xGp;
  public String[] xGe;
  public String[] xGf;
  public String[] xGg;
  public String[] xGh;
  public String[] xGi;
  public String[] xGj;
  public ArrayList<SmileyInfo> xGk;
  private ArrayList<a> xGl;
  private HashMap<String, SmileyInfo> xGm;
  private SparseArray<String> xGn;

  static
  {
    AppMethodBeat.i(62690);
    xGd = null;
    xGp = new f.1();
    AppMethodBeat.o(62690);
  }

  private f(Context paramContext)
  {
    AppMethodBeat.i(62676);
    this.xGe = null;
    this.xGf = null;
    this.xGg = null;
    this.xGh = null;
    this.xGi = null;
    this.xGj = null;
    this.xGl = new ArrayList();
    this.xGm = new HashMap();
    this.xGn = new SparseArray();
    long l = System.currentTimeMillis();
    this.xGe = paramContext.getResources().getStringArray(2131755053);
    this.xGf = paramContext.getResources().getStringArray(2131755056);
    this.xGg = paramContext.getResources().getStringArray(2131755054);
    this.xGh = paramContext.getResources().getStringArray(2131755058);
    this.xGi = paramContext.getResources().getStringArray(2131755055);
    this.xGj = paramContext.getResources().getStringArray(2131755057);
    dqN();
    ab.d("MicroMsg.QQSmileyManager", "QQSmileyManager use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(62676);
  }

  private static Drawable a(a parama)
  {
    AppMethodBeat.i(62686);
    int i = parama.pos;
    if (i >= 0);
    for (parama = b.dqD().qJ(i); ; parama = anX(parama.name))
    {
      AppMethodBeat.o(62686);
      return parama;
    }
  }

  private boolean a(int paramInt1, SpannableString paramSpannableString, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(62685);
    a locala = anW(paramSpannableString.subSequence(paramInt1, paramSpannableString.length()));
    if (locala != null)
    {
      Drawable localDrawable = a(locala);
      if ((localDrawable != null) && (paramInt1 <= paramSpannableString.length()) && (locala.text.length() + paramInt1 <= paramSpannableString.length()))
      {
        b.dqD().a(paramSpannableString, localDrawable, paramInt1, paramInt1 + locala.text.length(), paramInt2);
        AppMethodBeat.o(62685);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.QQSmileyManager", "spanQQSmileyIcon failed. drawable not found. smiley:%s", new Object[] { locala.toString() });
      AppMethodBeat.o(62685);
    }
  }

  // ERROR //
  static Drawable anX(String paramString)
  {
    // Byte code:
    //   0: ldc 198
    //   2: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 156	java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial 157	java/lang/StringBuilder:<init>	()V
    //   12: invokestatic 203	com/tencent/mm/ao/a:afV	()Ljava/lang/String;
    //   15: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: aload_0
    //   19: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: invokevirtual 175	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   25: astore_1
    //   26: aload_1
    //   27: invokestatic 212	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   30: ifeq +87 -> 117
    //   33: aload_1
    //   34: invokestatic 216	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   37: astore_0
    //   38: aload_0
    //   39: astore_1
    //   40: new 218	android/graphics/BitmapFactory$Options
    //   43: astore_2
    //   44: aload_0
    //   45: astore_1
    //   46: aload_2
    //   47: invokespecial 219	android/graphics/BitmapFactory$Options:<init>	()V
    //   50: aload_0
    //   51: astore_1
    //   52: aload_2
    //   53: getstatic 225	android/graphics/Bitmap$Config:RGB_565	Landroid/graphics/Bitmap$Config;
    //   56: putfield 228	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
    //   59: aload_0
    //   60: astore_1
    //   61: aload_0
    //   62: aconst_null
    //   63: aload_2
    //   64: invokestatic 234	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   67: astore_3
    //   68: aload_3
    //   69: ifnonnull +12 -> 81
    //   72: aload_0
    //   73: astore_1
    //   74: ldc 114
    //   76: ldc 236
    //   78: invokestatic 239	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   81: aload_0
    //   82: astore_1
    //   83: new 241	android/graphics/drawable/BitmapDrawable
    //   86: astore_2
    //   87: aload_0
    //   88: astore_1
    //   89: aload_2
    //   90: invokestatic 247	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   93: invokevirtual 96	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   96: aload_3
    //   97: invokespecial 250	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //   100: aload_0
    //   101: ifnull +7 -> 108
    //   104: aload_0
    //   105: invokevirtual 255	java/io/InputStream:close	()V
    //   108: ldc 198
    //   110: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: aload_2
    //   114: astore_0
    //   115: aload_0
    //   116: areturn
    //   117: ldc 114
    //   119: ldc_w 257
    //   122: iconst_2
    //   123: anewarray 4	java/lang/Object
    //   126: dup
    //   127: iconst_0
    //   128: aload_1
    //   129: aastore
    //   130: dup
    //   131: iconst_1
    //   132: aload_0
    //   133: aastore
    //   134: invokestatic 260	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: invokestatic 247	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   140: invokevirtual 264	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   143: ldc_w 266
    //   146: aload_0
    //   147: invokestatic 269	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   150: invokevirtual 273	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   153: invokevirtual 278	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   156: astore_0
    //   157: goto -119 -> 38
    //   160: astore_0
    //   161: ldc 114
    //   163: aload_0
    //   164: invokestatic 284	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   167: invokestatic 239	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   170: goto -62 -> 108
    //   173: astore_2
    //   174: aconst_null
    //   175: astore_0
    //   176: aload_0
    //   177: astore_1
    //   178: ldc 114
    //   180: aload_2
    //   181: invokestatic 284	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   184: invokestatic 239	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   187: aload_0
    //   188: ifnull +7 -> 195
    //   191: aload_0
    //   192: invokevirtual 255	java/io/InputStream:close	()V
    //   195: ldc 198
    //   197: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   200: aconst_null
    //   201: astore_0
    //   202: goto -87 -> 115
    //   205: astore_0
    //   206: ldc 114
    //   208: aload_0
    //   209: invokestatic 284	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   212: invokestatic 239	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   215: goto -20 -> 195
    //   218: astore_0
    //   219: aconst_null
    //   220: astore_1
    //   221: aload_1
    //   222: ifnull +7 -> 229
    //   225: aload_1
    //   226: invokevirtual 255	java/io/InputStream:close	()V
    //   229: ldc 198
    //   231: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   234: aload_0
    //   235: athrow
    //   236: astore_1
    //   237: ldc 114
    //   239: aload_1
    //   240: invokestatic 284	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   243: invokestatic 239	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   246: goto -17 -> 229
    //   249: astore_0
    //   250: goto -29 -> 221
    //   253: astore_2
    //   254: goto -78 -> 176
    //
    // Exception table:
    //   from	to	target	type
    //   104	108	160	java/io/IOException
    //   26	38	173	java/io/IOException
    //   117	157	173	java/io/IOException
    //   191	195	205	java/io/IOException
    //   26	38	218	finally
    //   117	157	218	finally
    //   225	229	236	java/io/IOException
    //   40	44	249	finally
    //   46	50	249	finally
    //   52	59	249	finally
    //   61	68	249	finally
    //   74	81	249	finally
    //   83	87	249	finally
    //   89	100	249	finally
    //   178	187	249	finally
    //   40	44	253	java/io/IOException
    //   46	50	253	java/io/IOException
    //   52	59	253	java/io/IOException
    //   61	68	253	java/io/IOException
    //   74	81	253	java/io/IOException
    //   83	87	253	java/io/IOException
    //   89	100	253	java/io/IOException
  }

  public static f dqL()
  {
    AppMethodBeat.i(62677);
    if (xGd == null);
    try
    {
      if (xGd == null)
      {
        localf = new com/tencent/mm/cb/f;
        localf.<init>(ah.getContext());
        xGd = localf;
      }
      f localf = xGd;
      AppMethodBeat.o(62677);
      return localf;
    }
    finally
    {
      AppMethodBeat.o(62677);
    }
  }

  private int dqM()
  {
    int i = 0;
    try
    {
      AppMethodBeat.i(62678);
      this.xGl.clear();
      if ((this.xGe != null) && (this.xGg != null) && (this.xGe.length == this.xGg.length))
      {
        int j = this.xGe.length;
        i = 0;
        if (i < j)
        {
          String str1 = this.xGe[i];
          Object localObject1 = this.xGg[i];
          Object localObject2;
          label96: Object localObject4;
          label120: Object localObject5;
          if ((this.xGf != null) && (this.xGf.length > i))
          {
            localObject2 = this.xGf[i];
            if ((this.xGh == null) || (this.xGh.length <= i))
              break label411;
            localObject4 = this.xGh[i];
            if ((this.xGi == null) || (this.xGi.length <= i))
              break label419;
            localObject5 = this.xGi[i];
            label144: if ((this.xGj == null) || (this.xGj.length <= i))
              break label427;
          }
          label411: label419: label427: for (String str2 = this.xGj[i]; ; str2 = "")
          {
            SmileyInfo localSmileyInfo = new com/tencent/mm/storage/emotion/SmileyInfo;
            localSmileyInfo.<init>(str1, (String)localObject2, (String)localObject1, (String)localObject4, (String)localObject5, str2, i);
            Object localObject6 = this.xGl;
            a locala = new com/tencent/mm/cb/f$a;
            locala.<init>(i, str1, "");
            ((ArrayList)localObject6).add(locala);
            localObject6 = this.xGl;
            locala = new com/tencent/mm/cb/f$a;
            locala.<init>(i, (String)localObject1, "");
            ((ArrayList)localObject6).add(locala);
            localObject1 = this.xGl;
            localObject6 = new com/tencent/mm/cb/f$a;
            ((a)localObject6).<init>(i, (String)localObject2, "");
            ((ArrayList)localObject1).add(localObject6);
            localObject1 = this.xGl;
            localObject2 = new com/tencent/mm/cb/f$a;
            ((a)localObject2).<init>(i, (String)localObject4, "");
            ((ArrayList)localObject1).add(localObject2);
            localObject4 = this.xGl;
            localObject2 = new com/tencent/mm/cb/f$a;
            ((a)localObject2).<init>(i, (String)localObject5, "");
            ((ArrayList)localObject4).add(localObject2);
            localObject2 = this.xGl;
            localObject5 = new com/tencent/mm/cb/f$a;
            ((a)localObject5).<init>(i, str2, "");
            ((ArrayList)localObject2).add(localObject5);
            this.xGm.put(str1, localSmileyInfo);
            this.xGn.put(localSmileyInfo.field_eggIndex, localSmileyInfo.field_key);
            i++;
            break;
            localObject2 = "";
            break label96;
            localObject4 = "";
            break label120;
            localObject5 = "";
            break label144;
          }
        }
        i = j;
      }
      while (true)
      {
        if ((this.xGk == null) || (this.xGk.isEmpty()))
          Collections.sort(this.xGl, xGp);
        AppMethodBeat.o(62678);
        return i;
        ab.i("MicroMsg.QQSmileyManager", "read smiley array failed.");
      }
    }
    finally
    {
    }
  }

  private static void em(List<SmileyInfo> paramList)
  {
    AppMethodBeat.i(62680);
    paramList = paramList.iterator();
    SmileyInfo localSmileyInfo;
    do
    {
      if (!paramList.hasNext())
        break;
      localSmileyInfo = (SmileyInfo)paramList.next();
    }
    while (com.tencent.mm.vfs.e.ct(com.tencent.mm.ao.a.afV() + localSmileyInfo.field_fileName));
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.QQSmileyManager", "checkFile %b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
        ((d)g.M(d.class)).getProvider().bjT();
      AppMethodBeat.o(62680);
      return;
    }
  }

  public final boolean anV(String paramString)
  {
    AppMethodBeat.i(62682);
    boolean bool;
    if (anW(paramString) != null)
    {
      bool = true;
      AppMethodBeat.o(62682);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62682);
    }
  }

  public final a anW(String paramString)
  {
    AppMethodBeat.i(62683);
    a locala;
    int i;
    if (this.xGl != null)
    {
      locala = new a(0, paramString, "");
      i = Collections.binarySearch(this.xGl, locala, xGp);
      if (i >= 0)
        break label124;
      i = -i - 2;
    }
    label124: 
    while (true)
    {
      if ((i >= 0) && (i < this.xGl.size()))
      {
        locala = (a)this.xGl.get(i);
        if ((locala != null) && (paramString != null) && (paramString.startsWith(locala.text)))
        {
          paramString = (a)this.xGl.get(i);
          AppMethodBeat.o(62683);
        }
      }
      while (true)
      {
        return paramString;
        paramString = null;
        AppMethodBeat.o(62683);
      }
    }
  }

  public final SmileyInfo anY(String paramString)
  {
    AppMethodBeat.i(62688);
    if ((this.xGm != null) && (this.xGm.containsKey(paramString)))
    {
      paramString = (SmileyInfo)this.xGm.get(paramString);
      AppMethodBeat.o(62688);
    }
    while (true)
    {
      return paramString;
      ab.i("MicroMsg.QQSmileyManager", "getSmileyInfo failed. smiley map no contains key:%s", new Object[] { paramString.replace("\\", "\\\\") });
      paramString = null;
      AppMethodBeat.o(62688);
    }
  }

  public final SpannableString b(SpannableString paramSpannableString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(62684);
    if ((paramSpannableString == null) || (paramSpannableString.length() == 0))
      AppMethodBeat.o(62684);
    while (true)
    {
      return paramSpannableString;
      String str = paramSpannableString.toString();
      int i = 0;
      int j = -1;
      int m;
      while (true)
      {
        int k = str.indexOf('/', j + 1);
        j = k;
        m = i;
        if (k == -1)
          break;
        j = k;
        if (k < str.length() - 1)
        {
          j = k;
          m = i;
          if (i >= paramInt2)
            break;
          j = k;
          if (a(k, paramSpannableString, paramInt1))
          {
            i++;
            j = k;
          }
        }
      }
      while (true)
      {
        i = str.indexOf('[', j + 1);
        if (i == -1)
          break;
        j = i;
        if (i < str.length() - 1)
        {
          if (m >= paramInt2)
            break;
          j = i;
          if (a(i, paramSpannableString, paramInt1))
          {
            m++;
            j = i;
          }
        }
      }
      AppMethodBeat.o(62684);
    }
  }

  public final boolean dqN()
  {
    AppMethodBeat.i(62679);
    ab.i("MicroMsg.QQSmileyManager", "checkNewEmoji");
    ArrayList localArrayList = ((d)g.M(d.class)).getProvider().bjO();
    boolean bool;
    if ((localArrayList == null) || (localArrayList.isEmpty()))
    {
      dqO();
      bool = true;
      AppMethodBeat.o(62679);
    }
    while (true)
    {
      return bool;
      em(localArrayList);
      dqO();
      bool = false;
      AppMethodBeat.o(62679);
    }
  }

  public final void dqO()
  {
    long l;
    while (true)
    {
      try
      {
        AppMethodBeat.i(62681);
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("updateSmiley ");
        ab.i("MicroMsg.QQSmileyManager", bo.dpG());
        l = System.currentTimeMillis();
        this.xGm.clear();
        this.xGn.clear();
        dqM();
        this.xGk = ((PluginEmoji)g.M(PluginEmoji.class)).getProvider().bjO();
        if ((this.xGk == null) || (this.xGk.isEmpty()))
        {
          localObject1 = new com/tencent/mm/vfs/b;
          ((com.tencent.mm.vfs.b)localObject1).<init>("assets:///newemoji/newemoji-config.xml");
          this.xGk = com.tencent.mm.emoji.e.a.a((com.tencent.mm.vfs.b)localObject1);
        }
        if ((this.xGk == null) || (this.xGk.isEmpty()))
          break;
        Iterator localIterator = this.xGk.iterator();
        if (!localIterator.hasNext())
          break label698;
        localObject1 = (SmileyInfo)localIterator.next();
        this.xGm.put(((SmileyInfo)localObject1).field_key, localObject1);
        this.xGn.put(((SmileyInfo)localObject1).field_eggIndex, ((SmileyInfo)localObject1).field_key);
        localObject3 = this.xGl;
        localObject4 = new com/tencent/mm/cb/f$a;
        ((a)localObject4).<init>(-1, ((SmileyInfo)localObject1).field_key, ((SmileyInfo)localObject1).field_fileName);
        ((ArrayList)localObject3).add(localObject4);
        if ((bo.isNullOrNil(((SmileyInfo)localObject1).field_cnValue)) || ("null".equalsIgnoreCase(((SmileyInfo)localObject1).field_cnValue)))
        {
          localObject4 = this.xGl;
          localObject3 = new com/tencent/mm/cb/f$a;
          ((a)localObject3).<init>(-1, ((SmileyInfo)localObject1).field_key, ((SmileyInfo)localObject1).field_fileName);
          ((ArrayList)localObject4).add(localObject3);
          if ((!bo.isNullOrNil(((SmileyInfo)localObject1).field_qqValue)) && (!"null".equalsIgnoreCase(((SmileyInfo)localObject1).field_qqValue)))
            break label546;
          localObject4 = this.xGl;
          localObject3 = new com/tencent/mm/cb/f$a;
          ((a)localObject3).<init>(-1, ((SmileyInfo)localObject1).field_key, ((SmileyInfo)localObject1).field_fileName);
          ((ArrayList)localObject4).add(localObject3);
          if ((!bo.isNullOrNil(((SmileyInfo)localObject1).field_twValue)) && (!"null".equalsIgnoreCase(((SmileyInfo)localObject1).field_twValue)))
            break label582;
          localObject3 = this.xGl;
          localObject4 = new com/tencent/mm/cb/f$a;
          ((a)localObject4).<init>(-1, ((SmileyInfo)localObject1).field_key, ((SmileyInfo)localObject1).field_fileName);
          ((ArrayList)localObject3).add(localObject4);
          if ((!bo.isNullOrNil(((SmileyInfo)localObject1).field_enValue)) && (!"null".equalsIgnoreCase(((SmileyInfo)localObject1).field_enValue)))
            break label618;
          localObject4 = this.xGl;
          localObject3 = new com/tencent/mm/cb/f$a;
          ((a)localObject3).<init>(-1, ((SmileyInfo)localObject1).field_key, ((SmileyInfo)localObject1).field_fileName);
          ((ArrayList)localObject4).add(localObject3);
          if ((!bo.isNullOrNil(((SmileyInfo)localObject1).field_thValue)) && (!"null".equalsIgnoreCase(((SmileyInfo)localObject1).field_thValue)))
            break label654;
          localObject4 = this.xGl;
          localObject3 = new com/tencent/mm/cb/f$a;
          ((a)localObject3).<init>(-1, ((SmileyInfo)localObject1).field_key, ((SmileyInfo)localObject1).field_fileName);
          ((ArrayList)localObject4).add(localObject3);
          continue;
        }
      }
      finally
      {
      }
      Object localObject4 = this.xGl;
      Object localObject3 = new com/tencent/mm/cb/f$a;
      ((a)localObject3).<init>(-1, localObject2.field_cnValue, localObject2.field_fileName);
      ((ArrayList)localObject4).add(localObject3);
      continue;
      label546: localObject3 = this.xGl;
      localObject4 = new com/tencent/mm/cb/f$a;
      ((a)localObject4).<init>(-1, localObject2.field_qqValue, localObject2.field_fileName);
      ((ArrayList)localObject3).add(localObject4);
      continue;
      label582: localObject4 = this.xGl;
      localObject3 = new com/tencent/mm/cb/f$a;
      ((a)localObject3).<init>(-1, localObject2.field_twValue, localObject2.field_fileName);
      ((ArrayList)localObject4).add(localObject3);
      continue;
      label618: localObject3 = this.xGl;
      localObject4 = new com/tencent/mm/cb/f$a;
      ((a)localObject4).<init>(-1, localObject2.field_enValue, localObject2.field_fileName);
      ((ArrayList)localObject3).add(localObject4);
      continue;
      label654: localObject4 = this.xGl;
      localObject3 = new com/tencent/mm/cb/f$a;
      ((a)localObject3).<init>(-1, localObject2.field_thValue, localObject2.field_fileName);
      ((ArrayList)localObject4).add(localObject3);
    }
    ab.i("MicroMsg.QQSmileyManager", "newSmileys list is null.");
    label698: Collections.sort(this.xGl, xGp);
    ab.i("MicroMsg.QQSmileyManager", "updateSmiley end use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(62681);
  }

  public final ArrayList<String> dqP()
  {
    AppMethodBeat.i(62689);
    ArrayList localArrayList = new ArrayList();
    if (this.xGk != null)
    {
      Iterator localIterator = this.xGk.iterator();
      while (localIterator.hasNext())
        localArrayList.add(((SmileyInfo)localIterator.next()).field_key);
    }
    AppMethodBeat.o(62689);
    return localArrayList;
  }

  public static final class a
  {
    public String name;
    public int pos;
    public String text;

    a()
    {
    }

    a(int paramInt, String paramString1, String paramString2)
    {
      this.pos = paramInt;
      this.text = paramString1;
      this.name = paramString2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cb.f
 * JD-Core Version:    0.6.2
 */