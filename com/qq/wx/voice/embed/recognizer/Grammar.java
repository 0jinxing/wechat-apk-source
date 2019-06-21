package com.qq.wx.voice.embed.recognizer;

import android.content.Context;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Grammar
{
  public static String mData = null;
  public static String mDataPath = null;
  public static String mSo = null;
  private f a;
  private a b;
  private boolean c;
  private boolean d;
  private ArrayList e;

  public Grammar()
  {
    AppMethodBeat.i(123213);
    this.a = null;
    this.b = new a();
    this.c = false;
    this.d = false;
    this.e = null;
    this.a = new f();
    AppMethodBeat.o(123213);
  }

  private String a()
  {
    int i = 0;
    AppMethodBeat.i(123217);
    int j = 0;
    Object localObject;
    if (j >= this.e.size())
      localObject = new StringBuffer("");
    for (j = i; ; j++)
    {
      if (j >= this.e.size())
      {
        localObject = ((StringBuffer)localObject).toString();
        AppMethodBeat.o(123217);
        return localObject;
        ((d)this.e.get(j)).bCw = a(((d)this.e.get(j)).userName);
        ((d)this.e.get(j)).bCx = a(((d)this.e.get(j)).bCu);
        ((d)this.e.get(j)).bCy = a(((d)this.e.get(j)).bCv);
        j++;
        break;
      }
      String str = ((d)this.e.get(j)).bCw;
      if (!str.isEmpty())
      {
        if (((StringBuffer)localObject).length() > 0)
          ((StringBuffer)localObject).append("\n");
        ((StringBuffer)localObject).append(str);
      }
      str = ((d)this.e.get(j)).bCx;
      if (!str.isEmpty())
      {
        if (((StringBuffer)localObject).length() > 0)
          ((StringBuffer)localObject).append("\n");
        ((StringBuffer)localObject).append(str);
      }
      str = ((d)this.e.get(j)).bCy;
      if (!str.isEmpty())
      {
        if (((StringBuffer)localObject).length() > 0)
          ((StringBuffer)localObject).append("\n");
        ((StringBuffer)localObject).append(str);
      }
    }
  }

  private static String a(String paramString)
  {
    AppMethodBeat.i(123218);
    paramString = new String(paramString).replaceAll("[^(a-zA-Z0-9\\u4e00-\\u9fa5)]", "").replaceAll("0", "零").replaceAll("1", "一").replaceAll("2", "二").replaceAll("3", "三").replaceAll("4", "四").replaceAll("5", "五").replaceAll("6", "六").replaceAll("7", "七").replaceAll("8", "八").replaceAll("9", "九");
    AppMethodBeat.o(123218);
    return paramString;
  }

  public int begin()
  {
    AppMethodBeat.i(123219);
    int i = GrammarNative.begin();
    AppMethodBeat.o(123219);
    return i;
  }

  public int checkFiles(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    int i = 0;
    AppMethodBeat.i(123214);
    int j;
    if (this.c)
    {
      AppMethodBeat.o(123214);
      j = i;
    }
    while (true)
    {
      return j;
      if ((paramContext == null) || (paramString1 == null) || (paramString2 == null) || (paramString3 == null))
      {
        j = -303;
        AppMethodBeat.o(123214);
      }
      else
      {
        if (Build.VERSION.SDK_INT >= 24)
        {
          int k = this.a.e("/vendor/lib/", paramString2, paramString3);
          j = k;
          if (k >= 0);
        }
        label88: for (j = this.a.c(paramContext, paramString1, paramString2, paramString3); ; j = this.a.e(paramString1, paramString2, paramString3))
        {
          if (j >= 0)
            break label149;
          AppMethodBeat.o(123214);
          break;
          if ((paramString1.compareTo("/system/lib") != 0) && (paramString1.compareTo("/system/lib/") != 0))
            break label88;
        }
        label149: mDataPath = this.a.b;
        mData = "libwxvoiceembed.bin";
        mSo = "libwxvoiceembed.so";
        this.c = true;
        AppMethodBeat.o(123214);
        j = i;
      }
    }
  }

  public int end()
  {
    AppMethodBeat.i(123221);
    int i = GrammarNative.end();
    AppMethodBeat.o(123221);
    return i;
  }

  public int getResult(a parama)
  {
    int i = 0;
    AppMethodBeat.i(123222);
    int j = GrammarNative.getResult(this);
    if (j < 0)
      AppMethodBeat.o(123222);
    while (true)
    {
      return j;
      parama.text = this.b.text;
      if (this.b.name != null)
        break;
      parama.name = null;
      AppMethodBeat.o(123222);
      j = i;
    }
    label226: for (j = 0; ; j++)
    {
      if (j >= this.e.size());
      while (true)
      {
        AppMethodBeat.o(123222);
        j = i;
        break;
        if (((d)this.e.get(j)).bCw.compareTo(this.b.name) == 0)
        {
          parama.name = ((d)this.e.get(j)).userName;
        }
        else if (((d)this.e.get(j)).bCx.compareTo(this.b.name) == 0)
        {
          parama.name = ((d)this.e.get(j)).userName;
        }
        else
        {
          if (((d)this.e.get(j)).bCy.compareTo(this.b.name) != 0)
            break label226;
          parama.name = ((d)this.e.get(j)).userName;
        }
      }
    }
  }

  // ERROR //
  public int init(ArrayList paramArrayList)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 222
    //   4: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: getfield 47	com/qq/wx/voice/embed/recognizer/Grammar:d	Z
    //   11: ifeq +10 -> 21
    //   14: ldc 222
    //   16: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: iload_2
    //   20: ireturn
    //   21: aload_1
    //   22: ifnonnull +15 -> 37
    //   25: sipush -303
    //   28: istore_2
    //   29: ldc 222
    //   31: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   34: goto -15 -> 19
    //   37: new 224	java/lang/StringBuilder
    //   40: astore_3
    //   41: aload_3
    //   42: getstatic 21	com/qq/wx/voice/embed/recognizer/Grammar:mDataPath	Ljava/lang/String;
    //   45: invokestatic 228	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   48: invokespecial 229	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   51: aload_3
    //   52: ldc 231
    //   54: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: getstatic 25	com/qq/wx/voice/embed/recognizer/Grammar:mSo	Ljava/lang/String;
    //   60: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: invokevirtual 235	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   66: invokestatic 240	java/lang/System:load	(Ljava/lang/String;)V
    //   69: aload_0
    //   70: aload_1
    //   71: putfield 49	com/qq/wx/voice/embed/recognizer/Grammar:e	Ljava/util/ArrayList;
    //   74: aload_0
    //   75: invokespecial 242	com/qq/wx/voice/embed/recognizer/Grammar:a	()Ljava/lang/String;
    //   78: astore_1
    //   79: getstatic 21	com/qq/wx/voice/embed/recognizer/Grammar:mDataPath	Ljava/lang/String;
    //   82: invokevirtual 246	java/lang/String:getBytes	()[B
    //   85: getstatic 23	com/qq/wx/voice/embed/recognizer/Grammar:mData	Ljava/lang/String;
    //   88: invokevirtual 246	java/lang/String:getBytes	()[B
    //   91: aload_1
    //   92: invokevirtual 247	java/lang/String:toString	()Ljava/lang/String;
    //   95: ldc 249
    //   97: invokevirtual 252	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   100: invokestatic 255	com/qq/wx/voice/embed/recognizer/GrammarNative:init	([B[B[B)I
    //   103: ifge +113 -> 216
    //   106: new 224	java/lang/StringBuilder
    //   109: astore_3
    //   110: aload_3
    //   111: getstatic 21	com/qq/wx/voice/embed/recognizer/Grammar:mDataPath	Ljava/lang/String;
    //   114: invokestatic 228	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   117: invokespecial 229	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   120: aload_3
    //   121: ldc_w 257
    //   124: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: getstatic 23	com/qq/wx/voice/embed/recognizer/Grammar:mData	Ljava/lang/String;
    //   130: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: ldc_w 257
    //   136: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: aload_1
    //   140: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: pop
    //   144: ldc 222
    //   146: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: bipush 155
    //   151: istore_2
    //   152: goto -133 -> 19
    //   155: astore_1
    //   156: sipush -205
    //   159: istore_2
    //   160: ldc 222
    //   162: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   165: goto -146 -> 19
    //   168: astore_3
    //   169: new 224	java/lang/StringBuilder
    //   172: dup
    //   173: getstatic 21	com/qq/wx/voice/embed/recognizer/Grammar:mDataPath	Ljava/lang/String;
    //   176: invokestatic 228	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   179: invokespecial 229	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   182: ldc_w 257
    //   185: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: getstatic 23	com/qq/wx/voice/embed/recognizer/Grammar:mData	Ljava/lang/String;
    //   191: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: ldc_w 257
    //   197: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: aload_1
    //   201: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: pop
    //   205: ldc 222
    //   207: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   210: bipush 155
    //   212: istore_2
    //   213: goto -194 -> 19
    //   216: aload_0
    //   217: iconst_1
    //   218: putfield 47	com/qq/wx/voice/embed/recognizer/Grammar:d	Z
    //   221: ldc 222
    //   223: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   226: goto -207 -> 19
    //
    // Exception table:
    //   from	to	target	type
    //   37	69	155	java/lang/Exception
    //   79	144	168	java/io/UnsupportedEncodingException
  }

  public void onGetResult(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    AppMethodBeat.i(123223);
    if (paramArrayOfByte1 != null);
    try
    {
      paramArrayOfByte2 = this.b;
      String str = new java/lang/String;
      str.<init>(paramArrayOfByte1, "GBK");
      for (paramArrayOfByte2.text = str; paramArrayOfByte3 != null; this.b.text = null)
      {
        paramArrayOfByte2 = this.b;
        paramArrayOfByte1 = new java/lang/String;
        paramArrayOfByte1.<init>(paramArrayOfByte3, "GBK");
        paramArrayOfByte2.name = paramArrayOfByte1;
        AppMethodBeat.o(123223);
        return;
      }
    }
    catch (UnsupportedEncodingException paramArrayOfByte1)
    {
      while (true)
      {
        AppMethodBeat.o(123223);
        continue;
        this.b.name = null;
        AppMethodBeat.o(123223);
      }
    }
  }

  public int recognize(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(123220);
    paramInt = GrammarNative.recognize(paramArrayOfByte, paramInt);
    AppMethodBeat.o(123220);
    return paramInt;
  }

  public int update(ArrayList paramArrayList)
  {
    int i = -106;
    AppMethodBeat.i(123216);
    if (paramArrayList == null)
    {
      i = -303;
      AppMethodBeat.o(123216);
    }
    while (true)
    {
      return i;
      this.e = paramArrayList;
      paramArrayList = a();
      try
      {
        int j = GrammarNative.update(paramArrayList.getBytes("GBK"));
        if (j >= 0)
          break label68;
        AppMethodBeat.o(123216);
      }
      catch (UnsupportedEncodingException paramArrayList)
      {
        AppMethodBeat.o(123216);
      }
      continue;
      label68: i = 0;
      AppMethodBeat.o(123216);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.qq.wx.voice.embed.recognizer.Grammar
 * JD-Core Version:    0.6.2
 */