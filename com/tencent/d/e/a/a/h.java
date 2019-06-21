package com.tencent.d.e.a.a;

import android.content.Context;
import com.qq.taf.jce.JceInputStream;
import com.tencent.d.e.a.b.a;
import com.tencent.d.f.b;
import com.tencent.d.f.c;
import com.tencent.d.f.f;
import com.tencent.d.f.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class h
{
  private static final j<h> Atp;
  public Context mContext;
  public boolean mInit = false;

  static
  {
    AppMethodBeat.i(114568);
    Atp = new h.1();
    AppMethodBeat.o(114568);
  }

  public static h dQz()
  {
    AppMethodBeat.i(114563);
    h localh = (h)Atp.get();
    AppMethodBeat.o(114563);
    return localh;
  }

  public static h.a e(Map<String, a> paramMap, int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(114566);
    if (paramMap == null)
    {
      AppMethodBeat.o(114566);
      paramMap = localObject1;
    }
    while (true)
    {
      return paramMap;
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramMap.keySet().iterator();
      Object localObject2 = null;
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        a locala = (a)paramMap.get(str);
        if ((locala != null) && (locala.requestType == paramInt))
        {
          localArrayList.add(str);
          if (localObject2 == null)
            localObject2 = locala;
          else
            localObject2.Aub.addAll(locala.Aub);
        }
      }
      if (localObject2 != null)
      {
        paramMap = new h.a((byte)0);
        paramMap.AtS = localObject2;
        paramMap.AtT = localArrayList;
        AppMethodBeat.o(114566);
      }
      else
      {
        AppMethodBeat.o(114566);
        paramMap = localObject1;
      }
    }
  }

  public static String hU(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(114567);
    String str = paramInt1 + "00" + paramInt2;
    AppMethodBeat.o(114567);
    return str;
  }

  public final Map<String, a> dQA()
  {
    AppMethodBeat.i(114565);
    HashMap localHashMap = new HashMap();
    Object localObject1 = this.mContext.getDir("turingmm", 0);
    if (localObject1 == null)
      AppMethodBeat.o(114565);
    while (true)
    {
      return localHashMap;
      File[] arrayOfFile = ((File)localObject1).listFiles();
      if (arrayOfFile == null)
      {
        AppMethodBeat.o(114565);
      }
      else
      {
        int i = arrayOfFile.length;
        int j = 0;
        if (j < i)
        {
          File localFile = arrayOfFile[j];
          Object localObject2;
          try
          {
            localObject1 = localFile.getAbsolutePath();
            localObject2 = new java/io/File;
            ((File)localObject2).<init>((String)localObject1);
            localObject1 = c.n(f.ah((File)localObject2), c.dQC());
            if (localObject1 == null)
            {
              localObject1 = null;
              label107: if (localObject1 != null)
                break label185;
              localObject1 = new java/lang/NullPointerException;
              ((NullPointerException)localObject1).<init>("csGroupRecord is null.");
              AppMethodBeat.o(114565);
              throw ((Throwable)localObject1);
            }
          }
          catch (Throwable localThrowable)
          {
            localFile.deleteOnExit();
          }
          while (true)
          {
            j++;
            break;
            localObject2 = b.cl(localThrowable);
            if (localObject2 == null)
            {
              locala = null;
              break label107;
            }
            a locala = new com/tencent/d/e/a/b/a;
            locala.<init>();
            JceInputStream localJceInputStream = new com/qq/taf/jce/JceInputStream;
            localJceInputStream.<init>((byte[])localObject2);
            locala.readFrom(localJceInputStream);
            break label107;
            label185: localHashMap.put(localFile.getAbsolutePath(), locala);
          }
        }
        AppMethodBeat.o(114565);
      }
    }
  }

  public final String hT(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(114564);
    String str = hU(paramInt1, paramInt2);
    File localFile = this.mContext.getDir("turingmm", 0);
    if (localFile == null)
    {
      str = "";
      AppMethodBeat.o(114564);
    }
    while (true)
    {
      return str;
      Object localObject1 = localFile.listFiles();
      if (localObject1 == null)
      {
        str = "";
        AppMethodBeat.o(114564);
      }
      else
      {
        Object localObject2 = new ArrayList();
        paramInt2 = localObject1.length;
        Object localObject3;
        for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
        {
          localObject3 = localObject1[paramInt1];
          if (((File)localObject3).getName().startsWith(str))
            ((List)localObject2).add(localObject3);
        }
        if (((List)localObject2).size() <= 2)
        {
          str = "";
          AppMethodBeat.o(114564);
        }
        else
        {
          localObject3 = new ArrayList();
          localObject1 = ((List)localObject2).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = ((File)((Iterator)localObject1).next()).getName().split("_");
            if ((localObject2.length == 2) && (localObject2[0].equals(str)))
              ((List)localObject3).add(Long.valueOf(Long.parseLong(localObject2[1])));
          }
          if (((List)localObject3).size() <= 2)
          {
            str = "";
            AppMethodBeat.o(114564);
          }
          else
          {
            Collections.sort((List)localObject3);
            str = localFile.getAbsolutePath() + File.separator + str + "_" + ((List)localObject3).get(0);
            AppMethodBeat.o(114564);
          }
        }
      }
    }
  }

  public final void init(Context paramContext)
  {
    this.mContext = paramContext;
    this.mInit = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.a.h
 * JD-Core Version:    0.6.2
 */