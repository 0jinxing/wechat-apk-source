package com.tencent.mm.vfs;

import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CombinedFileSystem extends AbstractFileSystem
{
  public static final Parcelable.Creator<CombinedFileSystem> CREATOR;
  private final FileSystem[] zYB;
  private final CombinedFileSystem.a[] zYC;
  private final int zYD;

  static
  {
    AppMethodBeat.i(54502);
    CREATOR = new CombinedFileSystem.1();
    AppMethodBeat.o(54502);
  }

  private CombinedFileSystem(Parcel paramParcel)
  {
    AppMethodBeat.i(54484);
    j.a(paramParcel, getClass());
    int j = paramParcel.readInt();
    this.zYB = new FileSystem[j];
    int k = 0;
    int m = 0;
    Object localObject;
    while (k < j)
    {
      localObject = (FileSystem)paramParcel.readParcelable(getClass().getClassLoader());
      if (localObject == null)
      {
        paramParcel = new ParcelFormatException();
        AppMethodBeat.o(54484);
        throw paramParcel;
      }
      this.zYB[k] = localObject;
      m |= ((FileSystem)localObject).aiR();
      k++;
    }
    this.zYD = m;
    k = paramParcel.readInt();
    this.zYC = new CombinedFileSystem.a[k];
    m = i;
    if (m < k)
    {
      localObject = paramParcel.readString();
      if (localObject == null);
      for (localObject = null; ; localObject = Pattern.compile((String)localObject))
      {
        i = paramParcel.readInt();
        this.zYC[m] = new CombinedFileSystem.a((Pattern)localObject, i, this.zYB[i]);
        m++;
        break;
      }
    }
    AppMethodBeat.o(54484);
  }

  private FileSystem asV(String paramString)
  {
    AppMethodBeat.i(54486);
    CombinedFileSystem.a[] arrayOfa = this.zYC;
    int i = arrayOfa.length;
    int j = 0;
    if (j < i)
    {
      CombinedFileSystem.a locala = arrayOfa[j];
      if ((locala.hnu == null) || (locala.hnu.matcher(paramString).matches()))
      {
        paramString = locala.zYF;
        AppMethodBeat.o(54486);
      }
    }
    while (true)
    {
      return paramString;
      j++;
      break;
      paramString = null;
      AppMethodBeat.o(54486);
    }
  }

  public final OutputStream L(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(54488);
    FileSystem localFileSystem = asV(paramString);
    if (localFileSystem == null)
    {
      paramString = new FileNotFoundException("No file system matches the path.");
      AppMethodBeat.o(54488);
      throw paramString;
    }
    paramString = localFileSystem.L(paramString, paramBoolean);
    AppMethodBeat.o(54488);
    return paramString;
  }

  public final List<FileSystem.a> M(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(54493);
    ArrayList localArrayList = new ArrayList();
    FileSystem[] arrayOfFileSystem = this.zYB;
    int i = arrayOfFileSystem.length;
    for (int j = 0; j < i; j++)
    {
      List localList = arrayOfFileSystem[j].M(paramString, paramBoolean);
      if ((localList != null) && (localList.size() > 0))
        localArrayList.addAll(localList);
    }
    AppMethodBeat.o(54493);
    return localArrayList;
  }

  public final boolean N(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(54495);
    FileSystem[] arrayOfFileSystem = this.zYB;
    int i = arrayOfFileSystem.length;
    int j = 0;
    boolean bool2;
    for (boolean bool1 = false; j < i; bool1 = bool2 | bool1)
    {
      bool2 = arrayOfFileSystem[j].N(paramString, paramBoolean);
      j++;
    }
    AppMethodBeat.o(54495);
    return bool1;
  }

  public final String O(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(54497);
    FileSystem localFileSystem = asV(paramString);
    if (localFileSystem == null)
    {
      paramString = null;
      AppMethodBeat.o(54497);
    }
    while (true)
    {
      return paramString;
      paramString = localFileSystem.O(paramString, paramBoolean);
      AppMethodBeat.o(54497);
    }
  }

  public final void a(CancellationSignal paramCancellationSignal)
  {
    AppMethodBeat.i(54499);
    for (FileSystem localFileSystem : this.zYB)
    {
      if (paramCancellationSignal.isCanceled())
        break;
      localFileSystem.a(paramCancellationSignal);
    }
    AppMethodBeat.o(54499);
  }

  // ERROR //
  public final boolean aS(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc 174
    //   4: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: aload_1
    //   9: invokespecial 122	com/tencent/mm/vfs/CombinedFileSystem:asV	(Ljava/lang/String;)Lcom/tencent/mm/vfs/FileSystem;
    //   12: astore 4
    //   14: aload_0
    //   15: aload_2
    //   16: invokespecial 122	com/tencent/mm/vfs/CombinedFileSystem:asV	(Ljava/lang/String;)Lcom/tencent/mm/vfs/FileSystem;
    //   19: astore 5
    //   21: aload 4
    //   23: ifnull +8 -> 31
    //   26: aload 5
    //   28: ifnonnull +10 -> 38
    //   31: ldc 174
    //   33: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: iload_3
    //   37: ireturn
    //   38: aload 4
    //   40: aload 5
    //   42: if_acmpne +21 -> 63
    //   45: aload 4
    //   47: aload_1
    //   48: aload_2
    //   49: invokeinterface 176 3 0
    //   54: istore_3
    //   55: ldc 174
    //   57: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   60: goto -24 -> 36
    //   63: aload 4
    //   65: aload_1
    //   66: invokeinterface 180 2 0
    //   71: astore 6
    //   73: aload 5
    //   75: aload_2
    //   76: iconst_0
    //   77: invokeinterface 131 3 0
    //   82: astore_2
    //   83: sipush 2048
    //   86: newarray byte
    //   88: astore 5
    //   90: aload 6
    //   92: aload 5
    //   94: invokevirtual 186	java/io/InputStream:read	([B)I
    //   97: istore 7
    //   99: iload 7
    //   101: iflt +42 -> 143
    //   104: aload_2
    //   105: aload 5
    //   107: iconst_0
    //   108: iload 7
    //   110: invokevirtual 192	java/io/OutputStream:write	([BII)V
    //   113: goto -23 -> 90
    //   116: astore_1
    //   117: aload 6
    //   119: ifnull +8 -> 127
    //   122: aload 6
    //   124: invokevirtual 195	java/io/InputStream:close	()V
    //   127: aload_2
    //   128: ifnull +7 -> 135
    //   131: aload_2
    //   132: invokevirtual 196	java/io/OutputStream:close	()V
    //   135: ldc 174
    //   137: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   140: goto -104 -> 36
    //   143: aload 6
    //   145: ifnull +8 -> 153
    //   148: aload 6
    //   150: invokevirtual 195	java/io/InputStream:close	()V
    //   153: aload_2
    //   154: ifnull +7 -> 161
    //   157: aload_2
    //   158: invokevirtual 196	java/io/OutputStream:close	()V
    //   161: aload 4
    //   163: aload_1
    //   164: invokeinterface 200 2 0
    //   169: istore_3
    //   170: ldc 174
    //   172: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   175: goto -139 -> 36
    //   178: astore_1
    //   179: aconst_null
    //   180: astore_2
    //   181: aconst_null
    //   182: astore 6
    //   184: aload 6
    //   186: ifnull +8 -> 194
    //   189: aload 6
    //   191: invokevirtual 195	java/io/InputStream:close	()V
    //   194: aload_2
    //   195: ifnull +7 -> 202
    //   198: aload_2
    //   199: invokevirtual 196	java/io/OutputStream:close	()V
    //   202: ldc 174
    //   204: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   207: aload_1
    //   208: athrow
    //   209: astore 6
    //   211: goto -58 -> 153
    //   214: astore_2
    //   215: goto -54 -> 161
    //   218: astore_1
    //   219: goto -92 -> 127
    //   222: astore_1
    //   223: goto -88 -> 135
    //   226: astore 6
    //   228: goto -34 -> 194
    //   231: astore_2
    //   232: goto -30 -> 202
    //   235: astore_1
    //   236: aconst_null
    //   237: astore_2
    //   238: goto -54 -> 184
    //   241: astore_1
    //   242: goto -58 -> 184
    //   245: astore_1
    //   246: aconst_null
    //   247: astore_2
    //   248: aconst_null
    //   249: astore 6
    //   251: goto -134 -> 117
    //   254: astore_1
    //   255: aconst_null
    //   256: astore_2
    //   257: goto -140 -> 117
    //
    // Exception table:
    //   from	to	target	type
    //   83	90	116	java/io/IOException
    //   90	99	116	java/io/IOException
    //   104	113	116	java/io/IOException
    //   63	73	178	finally
    //   148	153	209	java/io/IOException
    //   157	161	214	java/io/IOException
    //   122	127	218	java/io/IOException
    //   131	135	222	java/io/IOException
    //   189	194	226	java/io/IOException
    //   198	202	231	java/io/IOException
    //   73	83	235	finally
    //   83	90	241	finally
    //   90	99	241	finally
    //   104	113	241	finally
    //   63	73	245	java/io/IOException
    //   73	83	254	java/io/IOException
  }

  public final int aiR()
  {
    return this.zYD;
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean exists(String paramString)
  {
    AppMethodBeat.i(54489);
    FileSystem localFileSystem = asV(paramString);
    boolean bool;
    if ((localFileSystem != null) && (localFileSystem.exists(paramString)))
    {
      bool = true;
      AppMethodBeat.o(54489);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54489);
    }
  }

  public final InputStream openRead(String paramString)
  {
    AppMethodBeat.i(54487);
    FileSystem localFileSystem = asV(paramString);
    if (localFileSystem == null)
    {
      paramString = new FileNotFoundException("No file system matches the path.");
      AppMethodBeat.o(54487);
      throw paramString;
    }
    paramString = localFileSystem.openRead(paramString);
    AppMethodBeat.o(54487);
    return paramString;
  }

  public final void p(Map<String, String> paramMap)
  {
    AppMethodBeat.i(54498);
    FileSystem[] arrayOfFileSystem = this.zYB;
    int i = arrayOfFileSystem.length;
    for (int j = 0; j < i; j++)
      arrayOfFileSystem[j].p(paramMap);
    AppMethodBeat.o(54498);
  }

  public final boolean pI(String paramString)
  {
    AppMethodBeat.i(54492);
    FileSystem[] arrayOfFileSystem = this.zYB;
    int i = arrayOfFileSystem.length;
    int j = 0;
    boolean bool2;
    for (boolean bool1 = false; j < i; bool1 = bool2 | bool1)
    {
      bool2 = arrayOfFileSystem[j].pI(paramString);
      j++;
    }
    AppMethodBeat.o(54492);
    return bool1;
  }

  public final boolean t(String paramString, long paramLong)
  {
    AppMethodBeat.i(54491);
    FileSystem localFileSystem = asV(paramString);
    boolean bool;
    if ((localFileSystem != null) && (localFileSystem.t(paramString, paramLong)))
    {
      bool = true;
      AppMethodBeat.o(54491);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54491);
    }
  }

  public final boolean tf(String paramString)
  {
    AppMethodBeat.i(54494);
    FileSystem[] arrayOfFileSystem = this.zYB;
    int i = arrayOfFileSystem.length;
    int j = 0;
    boolean bool2;
    for (boolean bool1 = false; j < i; bool1 = bool2 | bool1)
    {
      bool2 = arrayOfFileSystem[j].tf(paramString);
      j++;
    }
    AppMethodBeat.o(54494);
    return bool1;
  }

  public final FileSystem.b tn(String paramString)
  {
    AppMethodBeat.i(54485);
    paramString = this.zYB[(this.zYB.length - 1)].tn(paramString);
    AppMethodBeat.o(54485);
    return paramString;
  }

  public final FileSystem.a to(String paramString)
  {
    AppMethodBeat.i(54490);
    FileSystem localFileSystem = asV(paramString);
    if (localFileSystem == null)
    {
      paramString = null;
      AppMethodBeat.o(54490);
    }
    while (true)
    {
      return paramString;
      paramString = localFileSystem.to(paramString);
      AppMethodBeat.o(54490);
    }
  }

  public String toString()
  {
    AppMethodBeat.i(54500);
    StringBuilder localStringBuilder = new StringBuilder("CombinedFS [");
    Object localObject = this.zYB;
    int i = localObject.length;
    for (int j = 0; j < i; j++)
      localStringBuilder.append(localObject[j].toString()).append(", ");
    localStringBuilder.setLength(localStringBuilder.length() - 2);
    localObject = ']';
    AppMethodBeat.o(54500);
    return localObject;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(54501);
    paramParcel.writeInt(1);
    paramParcel.writeInt(this.zYB.length);
    Object localObject = this.zYB;
    int i = localObject.length;
    for (int j = 0; j < i; j++)
      paramParcel.writeParcelable(localObject[j], paramInt);
    paramParcel.writeInt(this.zYC.length);
    CombinedFileSystem.a[] arrayOfa = this.zYC;
    j = arrayOfa.length;
    paramInt = 0;
    if (paramInt < j)
    {
      CombinedFileSystem.a locala = arrayOfa[paramInt];
      if (locala.hnu == null);
      for (localObject = null; ; localObject = locala.hnu.pattern())
      {
        paramParcel.writeString((String)localObject);
        paramParcel.writeInt(locala.zYE);
        paramInt++;
        break;
      }
    }
    AppMethodBeat.o(54501);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.CombinedFileSystem
 * JD-Core Version:    0.6.2
 */