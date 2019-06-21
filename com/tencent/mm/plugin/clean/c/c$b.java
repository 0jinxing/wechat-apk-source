package com.tencent.mm.plugin.clean.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.clean.c.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.e;

final class c$b extends a
{
  private String filePath;
  private long fileSize;
  int kwu = 0;

  public c$b(c paramc, String paramString)
  {
    super(paramc);
    this.filePath = paramString;
    this.fileSize = 0L;
  }

  private void HS(String paramString)
  {
    AppMethodBeat.i(18674);
    b localb = new b(paramString);
    if (localb.isDirectory())
    {
      String[] arrayOfString = localb.list();
      if (arrayOfString != null)
      {
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++)
        {
          String str = arrayOfString[j];
          HS(paramString + "/" + str);
        }
      }
      ab.v("MicroMsg.CleanController", "delete file rootFile: %s", new Object[] { paramString });
      localb.delete();
      AppMethodBeat.o(18674);
    }
    while (true)
    {
      return;
      ab.v("MicroMsg.CleanController", "delete file rootFile: %s", new Object[] { paramString });
      c.c(this.kwt, c.a(this.kwt) + localb.length());
      localb.delete();
      AppMethodBeat.o(18674);
    }
  }

  private static boolean HT(String paramString)
  {
    AppMethodBeat.i(18675);
    boolean bool;
    if ((paramString.length() > c.access$1600()) && (paramString.substring(c.access$1600()).indexOf("temp") == 0))
    {
      bool = true;
      AppMethodBeat.o(18675);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(18675);
    }
  }

  private void HU(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(18676);
    this.kwu += 1;
    if (paramString.endsWith("/sns"))
    {
      ab.i("MicroMsg.CleanController", "Scan sns folder: rootPath=%s", new Object[] { paramString });
      HV(paramString);
      AppMethodBeat.o(18676);
    }
    while (true)
    {
      return;
      if (paramString.endsWith("/music"))
      {
        ab.i("MicroMsg.CleanController", "Scan music folder: rootPath=%s", new Object[] { paramString });
        HW(paramString);
        AppMethodBeat.o(18676);
      }
      else
      {
        b localb = new b(paramString);
        if (localb.isDirectory())
        {
          String[] arrayOfString = localb.list();
          if (arrayOfString != null)
          {
            int j = arrayOfString.length;
            while (i < j)
            {
              localb = arrayOfString[i];
              HU(paramString + "/" + localb);
              i++;
            }
          }
          AppMethodBeat.o(18676);
        }
        else
        {
          long l = e.asZ(paramString);
          c.d(this.kwt, l);
          this.fileSize = (l + this.fileSize);
          AppMethodBeat.o(18676);
        }
      }
    }
  }

  private void HV(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(18677);
    Object localObject = new b(paramString);
    if (((b)localObject).isDirectory())
    {
      localObject = ((b)localObject).list();
      if (localObject != null)
      {
        int j = localObject.length;
        while (i < j)
        {
          String str = localObject[i];
          HV(paramString + "/" + str);
          i++;
        }
      }
      AppMethodBeat.o(18677);
    }
    while (true)
    {
      return;
      if ((System.currentTimeMillis() - ((b)localObject).lastModified() > c.bfO().longValue()) && (c.k(this.kwt)))
      {
        ab.v("MicroMsg.CleanController", "Clean 7 days file in sns rootPath=%s", new Object[] { paramString });
        ((b)localObject).delete();
        AppMethodBeat.o(18677);
      }
      else
      {
        long l = e.asZ(paramString);
        c.d(this.kwt, l);
        this.fileSize = (l + this.fileSize);
        AppMethodBeat.o(18677);
      }
    }
  }

  private void HW(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(18678);
    Object localObject = new b(paramString);
    if (((b)localObject).isDirectory())
    {
      localObject = ((b)localObject).list();
      if (localObject != null)
      {
        int j = localObject.length;
        while (i < j)
        {
          String str = localObject[i];
          HW(paramString + "/" + str);
          i++;
        }
      }
      AppMethodBeat.o(18678);
    }
    while (true)
    {
      return;
      if ((System.currentTimeMillis() - ((b)localObject).lastModified() > c.bfP().longValue()) && (c.k(this.kwt)))
      {
        ab.v("MicroMsg.CleanController", "Clean 90 days file in music rootPath=%s", new Object[] { paramString });
        ((b)localObject).delete();
        AppMethodBeat.o(18678);
      }
      else
      {
        long l = e.asZ(paramString);
        c.d(this.kwt, l);
        this.fileSize = (l + this.fileSize);
        AppMethodBeat.o(18678);
      }
    }
  }

  public final String alb()
  {
    AppMethodBeat.i(18672);
    String str = "filePath[" + this.filePath + "] scanCount[" + this.kwu + "]" + super.alb();
    AppMethodBeat.o(18672);
    return str;
  }

  public final void execute()
  {
    AppMethodBeat.i(18673);
    Object localObject;
    if ((HT(this.filePath)) && (c.k(this.kwt)))
    {
      ab.i("MicroMsg.CleanController", "Delete[%b] temp folder: %s ", new Object[] { Boolean.valueOf(c.k(this.kwt)), this.filePath });
      HS(this.filePath);
      localObject = new b(this.filePath).dMC();
      if ((((b)localObject).list() == null) || (((b)localObject).list().length == 0))
        ((b)localObject).delete();
      if (!c.a(this.kwt, this.filePath))
        break label422;
      c.a(this.kwt, c.d(this.kwt) + this.fileSize);
      label134: if (!HT(this.filePath))
        break label464;
      localObject = c.l(this.kwt);
      localObject[1] = ((int)(localObject[1] + this.fileSize));
    }
    while (true)
    {
      if (this.filePath.endsWith("/image2"))
      {
        localObject = c.l(this.kwt);
        localObject[3] = ((int)(localObject[3] + this.fileSize));
      }
      if (this.filePath.endsWith("/image"))
      {
        localObject = c.l(this.kwt);
        localObject[4] = ((int)(localObject[4] + this.fileSize));
      }
      if (this.filePath.endsWith("/video"))
      {
        localObject = c.l(this.kwt);
        localObject[5] = ((int)(localObject[5] + this.fileSize));
      }
      if (this.filePath.endsWith("/voice2"))
      {
        localObject = c.l(this.kwt);
        localObject[6] = ((int)(localObject[6] + this.fileSize));
      }
      if (this.filePath.endsWith("/WeiXin"))
      {
        localObject = c.l(this.kwt);
        localObject[7] = ((int)(localObject[7] + this.fileSize));
      }
      if (this.filePath.endsWith("/WeChat"))
      {
        localObject = c.l(this.kwt);
        localObject[8] = ((int)(localObject[8] + this.fileSize));
      }
      if (this.filePath.endsWith("/xlog"))
      {
        localObject = c.l(this.kwt);
        localObject[9] = ((int)(localObject[9] + this.fileSize));
      }
      AppMethodBeat.o(18673);
      return;
      HU(this.filePath);
      break;
      label422: localObject = this.filePath;
      aw.ZK();
      if (!((String)localObject).startsWith(com.tencent.mm.model.c.getAccPath()))
        break label134;
      c.b(this.kwt, c.c(this.kwt) + this.fileSize);
      break label134;
      label464: localObject = this.filePath;
      aw.ZK();
      if (((String)localObject).startsWith(com.tencent.mm.model.c.getAccPath()))
      {
        localObject = c.l(this.kwt);
        localObject[0] = ((int)(localObject[0] + this.fileSize));
      }
      else
      {
        localObject = c.l(this.kwt);
        localObject[2] = ((int)(localObject[2] + this.fileSize));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.c.b
 * JD-Core Version:    0.6.2
 */