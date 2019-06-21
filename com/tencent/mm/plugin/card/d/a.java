package com.tencent.mm.plugin.card.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.c;
import com.tencent.mm.al.f;
import com.tencent.mm.i.g;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  private static List<WeakReference<a.a>> kaD;

  static
  {
    AppMethodBeat.i(88808);
    kaD = new ArrayList();
    AppMethodBeat.o(88808);
  }

  public static void a(a.a parama)
  {
    AppMethodBeat.i(88805);
    if (kaD == null)
      kaD = new ArrayList();
    if (parama == null)
    {
      ab.e("MicroMsg.CDNDownloadHelpper", "ICDNDownloadCallback is null");
      AppMethodBeat.o(88805);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CDNDownloadHelpper", "register:%d", new Object[] { Integer.valueOf(parama.hashCode()) });
      kaD.add(new WeakReference(parama));
      AppMethodBeat.o(88805);
    }
  }

  public static void b(a.a parama)
  {
    AppMethodBeat.i(88806);
    if ((kaD == null) || (parama == null))
      AppMethodBeat.o(88806);
    while (true)
    {
      return;
      ab.i("MicroMsg.CDNDownloadHelpper", "unregister:%d", new Object[] { Integer.valueOf(parama.hashCode()) });
      for (int i = 0; ; i++)
      {
        if (i >= kaD.size())
          break label117;
        WeakReference localWeakReference = (WeakReference)kaD.get(i);
        if (localWeakReference != null)
        {
          a.a locala = (a.a)localWeakReference.get();
          if ((locala != null) && (locala.equals(parama)))
          {
            kaD.remove(localWeakReference);
            AppMethodBeat.o(88806);
            break;
          }
        }
      }
      label117: AppMethodBeat.o(88806);
    }
  }

  public static void g(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(88807);
    if ((paramString1 == null) || (paramString2 == null) || (paramInt1 == 0))
    {
      ab.e("MicroMsg.CDNDownloadHelpper", "the params is wrongful");
      AppMethodBeat.o(88807);
    }
    while (true)
    {
      return;
      Object localObject = ag.ck(paramString1);
      com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(m.kdI);
      if (!localb.mkdirs())
        ab.i("MicroMsg.CDNDownloadHelpper", "mkdirs failed.File is exist = " + localb.exists());
      if (paramInt2 == 2)
      {
        str = ".jpeg";
        if (!j.w(localb.dMD()).endsWith("/"))
          break label314;
      }
      label314: for (String str = j.w(localb.dMD()) + (String)localObject + str; ; str = j.w(localb.dMD()) + "/" + (String)localObject + str)
      {
        ab.i("MicroMsg.CDNDownloadHelpper", "get file path from capture file name : %s == %s", new Object[] { localObject, str });
        ab.i("MicroMsg.CDNDownloadHelpper", "before downloadVideoFromCDN fieldId:%s, aseKey:%s, dataLength:%d, type:%d, filePath:%s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str });
        ab.i("MicroMsg.CDNDownloadHelpper", "read file length = " + e.asZ(str));
        if ((!e.ct(str)) || (e.asZ(str) != paramInt1))
          break label363;
        for (paramInt1 = j; paramInt1 < kaD.size(); paramInt1++)
        {
          paramString2 = (WeakReference)kaD.get(paramInt1);
          if (paramString2 != null)
          {
            paramString2 = (a.a)paramString2.get();
            if (paramString2 != null)
              paramString2.dr(paramString1, str);
          }
        }
        str = ".mp4";
        break;
      }
      AppMethodBeat.o(88807);
      continue;
      label363: ab.i("MicroMsg.CDNDownloadHelpper", "filePath:%s is't exist, so download from CDN", new Object[] { str });
      localObject = new g();
      ((g)localObject).egl = new a.1(paramString1, str);
      ((g)localObject).cRY = false;
      ((g)localObject).field_mediaId = c.a("cardgiftfile", bo.anU(), paramString1, paramString1);
      ((g)localObject).field_fullpath = str;
      ((g)localObject).field_totalLen = paramInt1;
      ((g)localObject).field_fileType = com.tencent.mm.i.a.efH;
      ((g)localObject).field_fileId = paramString1;
      ((g)localObject).field_aesKey = paramString2;
      ((g)localObject).field_priority = com.tencent.mm.i.a.efC;
      ((g)localObject).field_needStorage = true;
      boolean bool = f.afx().b((g)localObject, -1);
      ab.i("MicroMsg.CDNDownloadHelpper", "add download cdn task : %b, fileId : %s", new Object[] { Boolean.valueOf(bool), ((g)localObject).field_fileId });
      if (!bool)
      {
        for (paramInt1 = i; paramInt1 < kaD.size(); paramInt1++)
        {
          paramString2 = (WeakReference)kaD.get(paramInt1);
          if (paramString2 != null)
          {
            paramString2 = (a.a)paramString2.get();
            if (paramString2 != null)
              paramString2.GS(paramString1);
          }
        }
        ab.e("MicroMsg.CDNDownloadHelpper", "can't download from cdn!!!");
      }
      AppMethodBeat.o(88807);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.a
 * JD-Core Version:    0.6.2
 */