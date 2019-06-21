package com.tencent.mm.plugin.gallery.model;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class e
{
  private static int bGt = 0;
  private static e mNO = null;
  public static boolean mNP = false;
  public static boolean mNQ = false;
  public static boolean mNR = false;
  public static boolean mNS = false;
  private l mNJ;
  private c mNK;
  private g mNL;
  private ArrayList<GalleryItem.MediaItem> mNM;
  private LinkedHashSet<GalleryItem.MediaItem> mNN;
  private HashSet<GalleryItem.MediaItem> mNT;
  private ArrayList<Bundle> mNU;
  private HashMap<Integer, Boolean> mNV;

  private e()
  {
    AppMethodBeat.i(21246);
    this.mNM = null;
    this.mNN = new LinkedHashSet();
    this.mNT = new HashSet();
    this.mNU = new ArrayList();
    this.mNV = new HashMap();
    if (this.mNK == null)
      this.mNK = new c();
    if (this.mNJ == null)
      this.mNJ = new l();
    if (this.mNL == null)
      this.mNL = new g();
    AppMethodBeat.o(21246);
  }

  public static void B(ArrayList<GalleryItem.MediaItem> paramArrayList)
  {
    AppMethodBeat.i(21256);
    bBX().mNM = paramArrayList;
    AppMethodBeat.o(21256);
  }

  public static GalleryItem.MediaItem NB(String paramString)
  {
    AppMethodBeat.i(21245);
    paramString = GalleryItem.MediaItem.a(0, 0L, paramString, "", "");
    if (bBX().mNM != null)
    {
      int i = bBX().mNM.indexOf(paramString);
      if (i >= 0)
      {
        paramString = (GalleryItem.MediaItem)bBX().mNM.get(i);
        AppMethodBeat.o(21245);
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(21245);
    }
  }

  public static void a(com.tencent.mm.plugin.gallery.stub.a parama, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(21260);
    ab.i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] selectSize:%s isSendRaw:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean1) });
    if (parama == null)
    {
      ab.e("MicroMsg.GalleryCore", "invoker is null");
      AppMethodBeat.o(21260);
      return;
    }
    int i;
    if (bBX().mNJ.hOZ == 3)
      i = 1;
    while (true)
    {
      int j;
      label85: Object localObject;
      label211: int k;
      int m;
      int n;
      int i1;
      boolean bool2;
      int i2;
      boolean bool3;
      label351: int i3;
      if (bBX().mNT != null)
      {
        j = bBX().mNT.size();
        ab.i("MicroMsg.GalleryCore", "[reportPhotoEdit] fromScene:%s,selectSize:%s,editSize:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(j) });
        if (j > 0)
          parama.aK(13858, i + "," + paramInt + "," + j + ",0");
        boolean bool1 = parama.hC(true);
        ab.i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] imageState:%s", new Object[] { Boolean.valueOf(bool1) });
        Iterator localIterator = bBX().mNU.iterator();
        label359: 
        do
        {
          if (!localIterator.hasNext())
            break label628;
          Bundle localBundle = (Bundle)localIterator.next();
          localObject = localBundle.getString("after_photo_edit");
          if ((!bool1) || (!paramBoolean2))
          {
            ab.i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] delete file:%s", new Object[] { localObject });
            com.tencent.mm.vfs.e.deleteFile((String)localObject);
            com.tencent.mm.sdk.f.a.a((String)localObject, ah.getContext());
          }
          k = localBundle.getInt("report_info_emotion_count");
          m = localBundle.getInt("report_info_text_count");
          n = localBundle.getInt("report_info_mosaic_count");
          i1 = localBundle.getInt("report_info_doodle_count");
          bool2 = localBundle.getBoolean("report_info_iscrop");
          i2 = localBundle.getInt("report_info_undo_count");
          bool3 = localBundle.getBoolean("report_info_is_rotation");
          if (!bool2)
            break;
          paramInt = 1;
          if (!bool3)
            break label612;
          i3 = 1;
          ab.i("MicroMsg.GalleryCore", "[reportPhotoEdit] emojiCount:%s,textCount:%s,mosaicCount:%s,penCount:%s,isCrop:%s,undoCount:%s,isRotation:%s", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(paramInt), Integer.valueOf(i2), Integer.valueOf(i3) });
        }
        while (j <= 0);
      }
      while (true)
      {
        try
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          localObject = ((StringBuilder)localObject).append(i).append(",").append(paramBoolean1).append(",").append(k).append(",").append(m).append(",").append(n).append(",").append(i1).append(",");
          if (!bool2)
            break label618;
          paramInt = 1;
          localObject = ((StringBuilder)localObject).append(paramInt).append(",").append(i2).append(",2");
          if (!bool3)
            break label623;
          paramInt = 1;
          parama.aK(13857, paramInt);
        }
        catch (RemoteException localRemoteException)
        {
          ab.printErrStackTrace("MicroMsg.GalleryCore", localRemoteException, "", new Object[0]);
        }
        break label211;
        if (bBX().mNJ.hOZ != 4)
          break label637;
        i = 2;
        break;
        j = 0;
        break label85;
        paramInt = 0;
        break label351;
        label612: i3 = 0;
        break label359;
        label618: paramInt = 0;
        continue;
        label623: paramInt = 0;
      }
      label628: AppMethodBeat.o(21260);
      break;
      label637: i = 0;
    }
  }

  public static void a(com.tencent.mm.plugin.gallery.stub.a parama, String paramString, int[] paramArrayOfInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 2;
    AppMethodBeat.i(21261);
    int j = bBX().mNJ.hOZ;
    int k;
    switch (j)
    {
    case 5:
    case 6:
    default:
      k = 0;
      ab.i("MicroMsg.GalleryCore", "[handleSelectImagePreviewReport] source:%s", new Object[] { Integer.valueOf(j) });
      if (parama == null)
      {
        ab.e("MicroMsg.GalleryCore", "invoker is null");
        AppMethodBeat.o(21261);
      }
      break;
    case 3:
    case 4:
    case 7:
    case 8:
    }
    while (true)
    {
      return;
      k = 1;
      break;
      k = i;
      if (bo.isNullOrNil(paramString))
        break;
      k = i;
      if (!paramString.equals(ah.getContext().getString(2131299589)))
        break;
      k = 6;
      break;
      k = 3;
      break;
      try
      {
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        parama.aK(14205, k + "," + k + "," + paramArrayOfInt[0] + "," + paramArrayOfInt[1] + "," + paramArrayOfInt[2] + "," + paramArrayOfInt[3] + "," + paramBoolean1 + "," + paramBoolean2 + "," + mNP + "," + mNQ + "," + mNR + "," + mNS);
        mNP = false;
        mNQ = false;
        mNR = false;
        mNS = false;
        AppMethodBeat.o(21261);
      }
      catch (RemoteException parama)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.GalleryCore", parama, "", new Object[0]);
      }
    }
  }

  private static e bBX()
  {
    AppMethodBeat.i(21247);
    if (mNO == null)
      mNO = new e();
    e locale = mNO;
    AppMethodBeat.o(21247);
    return locale;
  }

  public static c bBY()
  {
    AppMethodBeat.i(21248);
    c localc = bBX().mNK;
    AppMethodBeat.o(21248);
    return localc;
  }

  public static l bBZ()
  {
    AppMethodBeat.i(21249);
    l locall = bBX().mNJ;
    AppMethodBeat.o(21249);
    return locall;
  }

  public static g bCa()
  {
    AppMethodBeat.i(21250);
    g localg = bBX().mNL;
    AppMethodBeat.o(21250);
    return localg;
  }

  public static ArrayList<GalleryItem.MediaItem> bCb()
  {
    AppMethodBeat.i(138609);
    ArrayList localArrayList = bBX().mNM;
    AppMethodBeat.o(138609);
    return localArrayList;
  }

  public static HashSet<GalleryItem.MediaItem> bCc()
  {
    AppMethodBeat.i(21253);
    HashSet localHashSet = bBX().mNT;
    AppMethodBeat.o(21253);
    return localHashSet;
  }

  public static ArrayList<Bundle> bCd()
  {
    AppMethodBeat.i(21254);
    ArrayList localArrayList = bBX().mNU;
    AppMethodBeat.o(21254);
    return localArrayList;
  }

  public static LinkedHashSet<GalleryItem.MediaItem> bCe()
  {
    AppMethodBeat.i(21255);
    LinkedHashSet localLinkedHashSet = bBX().mNN;
    AppMethodBeat.o(21255);
    return localLinkedHashSet;
  }

  public static void bCf()
  {
    AppMethodBeat.i(21258);
    bBX().mNV.clear();
    AppMethodBeat.o(21258);
  }

  public static int bCg()
  {
    AppMethodBeat.i(21259);
    int i = bBX().mNV.size();
    AppMethodBeat.o(21259);
    return i;
  }

  public static void initialize()
  {
    try
    {
      bGt += 1;
      return;
    }
    finally
    {
    }
  }

  public static void release(boolean paramBoolean)
  {
    AppMethodBeat.i(21251);
    try
    {
      if (bGt > 0)
        bGt -= 1;
      if ((paramBoolean) && (bGt == 0))
      {
        bBX().mNJ = null;
        if (bBX().mNK != null)
        {
          localObject1 = bBX().mNK.mNv;
          Object localObject3;
          if (((d)localObject1).mNF != null)
          {
            localObject3 = ((d)localObject1).mNF;
            d.4 local4 = new com/tencent/mm/plugin/gallery/model/d$4;
            local4.<init>((d)localObject1);
            ((com.tencent.mm.a.f)localObject3).a(local4);
            ((d)localObject1).mNF = null;
          }
          if (((d)localObject1).mNG != null)
          {
            localObject3 = ((d)localObject1).mNG;
            ((f)localObject3).bCi();
            ((f)localObject3).bCj();
            ((f)localObject3).bCl();
            ((d)localObject1).mNG = null;
          }
          bBX().mNK = null;
        }
        Object localObject1 = bBX().mNL;
        if (((g)localObject1).mOa != null)
        {
          ((g)localObject1).mOa.quit();
          ((g)localObject1).mOa = null;
        }
        ((g)localObject1).mOd = null;
        if (((g)localObject1).mOb != null)
        {
          ((g)localObject1).mOb.quit();
          ((g)localObject1).mOb = null;
        }
        ((g)localObject1).mOe = null;
        if (((g)localObject1).mOc != null)
        {
          ((g)localObject1).mOc.quit();
          ((g)localObject1).mOc = null;
        }
        ((g)localObject1).mOf = null;
        bBX().mNL = null;
        mNO = null;
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(21251);
    }
  }

  public static void wk(int paramInt)
  {
    AppMethodBeat.i(21257);
    bBX().mNV.put(Integer.valueOf(paramInt), Boolean.TRUE);
    AppMethodBeat.o(21257);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.e
 * JD-Core Version:    0.6.2
 */