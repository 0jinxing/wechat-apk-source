package com.tencent.mm.plugin.appbrand.appstorage;

import android.text.TextUtils;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.a.b;

public final class w extends g
{
  public final String gXQ;
  public final String gYj;
  public volatile long gYk;
  private final w.b gYl;
  private final w.b gYm;
  private final w.a gYn;
  private final w.a gYo;
  private final w.a gYp;
  private final w.a gYq;
  private final w.a gYr;
  private final w.b gYs;
  private final w.a gYt;
  private final w.a gYu;
  private final w.a gYv;
  private final w.a gYw;
  private final w.a gYx;

  public w(String paramString)
  {
    this(paramString, "file:///usr");
  }

  public w(String paramString1, String paramString2)
  {
    AppMethodBeat.i(105453);
    this.gYk = -1L;
    this.gYl = new w.1(this);
    this.gYm = new w.6(this);
    this.gYn = new w.7(this);
    this.gYo = new w.8(this);
    this.gYp = new w.9(this);
    this.gYq = new w.10(this);
    this.gYr = new w.11(this);
    this.gYs = new w.12(this);
    this.gYt = new w.13(this);
    this.gYu = new w.2(this);
    this.gYv = new w.3(this);
    this.gYw = new w.4(this);
    this.gYx = new w.5(this);
    this.gXQ = paramString1;
    this.gYj = paramString2;
    d.i("MicroMsg.LuggageNonFlattenedFileSystem", "mRootPath:%s mPathPrefix:%s", new Object[] { this.gXQ, this.gYj });
    AppMethodBeat.o(105453);
  }

  private j a(String paramString, w.a parama, boolean paramBoolean, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105458);
    if (bo.isNullOrNil(paramString))
    {
      paramString = j.gXE;
      AppMethodBeat.o(105458);
    }
    while (true)
    {
      return paramString;
      paramString = l.yj(paramString.replaceFirst(Pattern.quote(this.gYj), ""));
      File localFile = awW();
      if (localFile == null)
      {
        paramString = j.gXC;
        AppMethodBeat.o(105458);
      }
      else
      {
        paramString = b.jj(localFile.getAbsolutePath(), paramString);
        if (bo.isNullOrNil(paramString))
        {
          paramString = j.gXE;
          AppMethodBeat.o(105458);
        }
        else
        {
          localFile = new File(paramString);
          paramString = awW();
          if ((paramString != null) && (e(paramString, localFile)));
          for (int i = 1; ; i = 0)
          {
            if (i != 0)
              break label146;
            paramString = j.gXE;
            AppMethodBeat.o(105458);
            break;
          }
          label146: if ((!paramBoolean) && (!localFile.getParentFile().exists()))
          {
            paramString = j.gXD;
            AppMethodBeat.o(105458);
          }
          else
          {
            paramString = parama.a(localFile, paramArrayOfObject);
            AppMethodBeat.o(105458);
          }
        }
      }
    }
  }

  private j a(String paramString, w.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105459);
    paramString = a(paramString, parama, false, paramArrayOfObject);
    AppMethodBeat.o(105459);
    return paramString;
  }

  private static boolean e(File paramFile1, File paramFile2)
  {
    AppMethodBeat.i(105460);
    boolean bool;
    if (paramFile2 != null)
      if (paramFile1.equals(paramFile2))
      {
        bool = true;
        AppMethodBeat.o(105460);
      }
    while (true)
    {
      return bool;
      paramFile2 = paramFile2.getParentFile();
      break;
      bool = false;
      AppMethodBeat.o(105460);
    }
  }

  public final j X(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(105463);
    paramString = a(paramString, this.gYn, paramBoolean, new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(105463);
    return paramString;
  }

  public final j Y(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(105464);
    paramString = a(paramString, this.gYo, paramBoolean, new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(105464);
    return paramString;
  }

  public final File Z(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(105472);
    Object localObject = new com.tencent.mm.plugin.appbrand.r.j();
    a(paramString, this.gYw, new Object[] { localObject });
    localObject = (File)((com.tencent.mm.plugin.appbrand.r.j)localObject).value;
    if (localObject == null)
    {
      d.e("MicroMsg.LuggageNonFlattenedFileSystem", "getAbsoluteFile with path(%s), get null file", new Object[] { paramString });
      AppMethodBeat.o(105472);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      if (!((File)localObject).exists())
      {
        d.e("MicroMsg.LuggageNonFlattenedFileSystem", "getAbsoluteFile with path(%s), file not exists", new Object[] { paramString });
        AppMethodBeat.o(105472);
        paramString = null;
      }
      else if ((!paramBoolean) && (!((File)localObject).isFile()))
      {
        d.e("MicroMsg.LuggageNonFlattenedFileSystem", "getAbsoluteFile with path(%s), not a file", new Object[] { paramString });
        AppMethodBeat.o(105472);
        paramString = null;
      }
      else if (l.F((File)localObject))
      {
        d.e("MicroMsg.LuggageNonFlattenedFileSystem", "getAbsoluteFile with path(%s), symlink file", new Object[] { paramString });
        AppMethodBeat.o(105472);
        paramString = null;
      }
      else
      {
        AppMethodBeat.o(105472);
        paramString = (String)localObject;
      }
    }
  }

  public final j a(com.tencent.mm.plugin.appbrand.r.j<String> paramj)
  {
    return j.gXO;
  }

  public final j a(File paramFile, String paramString, com.tencent.mm.plugin.appbrand.r.j<String> paramj)
  {
    AppMethodBeat.i(105474);
    if (!ca(paramString))
    {
      paramFile = j.gXO;
      AppMethodBeat.o(105474);
    }
    while (true)
    {
      return paramFile;
      if ((paramFile == null) || (!paramFile.exists()))
      {
        paramFile = j.gXB;
        AppMethodBeat.o(105474);
      }
      else if (TextUtils.isEmpty(paramString))
      {
        paramFile = j.gXO;
        AppMethodBeat.o(105474);
      }
      else
      {
        j localj = ye(paramString);
        Object localObject;
        if (localj != j.gXG)
        {
          localObject = localj;
          if (localj != j.gXI)
            break label132;
        }
        try
        {
          localObject = new java/io/FileInputStream;
          ((FileInputStream)localObject).<init>(paramFile);
          paramFile = a(paramString, (InputStream)localObject, false);
          localObject = paramFile;
          if (paramj != null)
          {
            paramj.value = paramString;
            localObject = paramFile;
          }
          label132: AppMethodBeat.o(105474);
          paramFile = (File)localObject;
        }
        catch (Exception paramFile)
        {
          paramFile = j.gXB;
          AppMethodBeat.o(105474);
        }
      }
    }
  }

  public final j a(File paramFile, String paramString, boolean paramBoolean, com.tencent.mm.plugin.appbrand.r.j<String> paramj)
  {
    return j.gXO;
  }

  public final j a(String paramString, k paramk)
  {
    AppMethodBeat.i(105469);
    paramString = a(paramString, this.gYt, new Object[] { paramk });
    AppMethodBeat.o(105469);
    return paramString;
  }

  public final j a(String paramString, com.tencent.mm.plugin.appbrand.r.j<List<h>> paramj)
  {
    AppMethodBeat.i(105465);
    paramString = a(paramString, this.gYp, new Object[] { paramj });
    AppMethodBeat.o(105465);
    return paramString;
  }

  public final j a(String paramString, File paramFile, boolean paramBoolean)
  {
    AppMethodBeat.i(105471);
    paramString = a(paramString, this.gYv, new Object[] { paramFile, Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(105471);
    return paramString;
  }

  public final j a(String paramString, InputStream paramInputStream, boolean paramBoolean)
  {
    AppMethodBeat.i(105467);
    if (paramInputStream == null)
    {
      paramString = j.gXB;
      AppMethodBeat.o(105467);
    }
    while (true)
    {
      return paramString;
      paramString = a(paramString, this.gYr, new Object[] { paramInputStream, Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(105467);
    }
  }

  public final void awP()
  {
    AppMethodBeat.i(105456);
    File localFile = new File(this.gXQ);
    l.E(localFile);
    if (localFile.exists())
      localFile.delete();
    AppMethodBeat.o(105456);
  }

  public final List<p.a> awQ()
  {
    return null;
  }

  final File awW()
  {
    AppMethodBeat.i(105457);
    File localFile1;
    if (TextUtils.isEmpty(this.gXQ))
    {
      localFile1 = null;
      AppMethodBeat.o(105457);
    }
    while (true)
    {
      return localFile1;
      localFile1 = new File(this.gXQ);
      if ((localFile1.exists()) && (localFile1.isFile()))
        localFile1.delete();
      localFile1.mkdirs();
      try
      {
        File localFile2 = new java/io/File;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localFile2.<init>(localFile1.getPath() + "/.nomedia");
        localFile2.createNewFile();
        label100: AppMethodBeat.o(105457);
      }
      catch (Exception localException)
      {
        break label100;
      }
    }
  }

  public final j b(String paramString, com.tencent.mm.plugin.appbrand.r.j<ByteBuffer> paramj)
  {
    AppMethodBeat.i(105466);
    paramString = a(paramString, this.gYq, new Object[] { paramj });
    AppMethodBeat.o(105466);
    return paramString;
  }

  public final j b(String paramString, File paramFile)
  {
    AppMethodBeat.i(105473);
    paramString = a(paramString, this.gYx, new Object[] { paramFile });
    AppMethodBeat.o(105473);
    return paramString;
  }

  public final boolean ca(String paramString)
  {
    AppMethodBeat.i(105454);
    boolean bool = bo.nullAsNil(paramString).startsWith(this.gYj);
    AppMethodBeat.o(105454);
    return bool;
  }

  public final j g(String paramString, List<u> paramList)
  {
    AppMethodBeat.i(105470);
    paramString = a(paramString, this.gYu, new Object[] { paramList });
    AppMethodBeat.o(105470);
    return paramString;
  }

  public final void initialize()
  {
    AppMethodBeat.i(105455);
    File localFile = awW();
    if ((localFile == null) || (!localFile.exists()))
      d.e("MicroMsg.LuggageNonFlattenedFileSystem", "Initialization Failed");
    AppMethodBeat.o(105455);
  }

  public final void release()
  {
  }

  public final j yd(String paramString)
  {
    AppMethodBeat.i(105461);
    paramString = a(paramString, this.gYl, new Object[0]);
    AppMethodBeat.o(105461);
    return paramString;
  }

  public final j ye(String paramString)
  {
    AppMethodBeat.i(105462);
    paramString = a(paramString, this.gYm, new Object[0]);
    AppMethodBeat.o(105462);
    return paramString;
  }

  public final j yf(String paramString)
  {
    AppMethodBeat.i(105468);
    paramString = a(paramString, this.gYs, new Object[0]);
    AppMethodBeat.o(105468);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.w
 * JD-Core Version:    0.6.2
 */