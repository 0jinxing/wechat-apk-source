package com.tencent.mm.plugin.wenote.model;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.le;
import com.tencent.mm.g.a.sc;
import com.tencent.mm.g.a.sc.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.fav.a.an;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abd;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  private static Map<String, String> mid;
  public static String uNA;
  public static String uNB;
  public static String uNC;
  private static String[] uND;
  private static String[] uNE;
  private static LinkedList<abd> uNF;
  private static String uNG;
  public static String uNt;
  public static String uNu;
  public static String uNv;
  public static String uNw;
  public static String uNx;
  public static String uNy;
  public static String uNz;

  static
  {
    AppMethodBeat.i(26646);
    uNt = an.bvi() + "/fav_fileicon_video.png";
    uNu = an.bvi() + "/fav_fileicon_music.png";
    uNv = an.bvi() + "/fav_list_img_default.png";
    uNw = an.bvi() + "/fav_fileicon_zip.png";
    uNx = an.bvi() + "/fav_fileicon_word.png";
    uNy = an.bvi() + "/fav_fileicon_ppt.png";
    uNz = an.bvi() + "/fav_fileicon_xls.png";
    uNA = an.bvi() + "/fav_fileicon_txt.png";
    uNB = an.bvi() + "/fav_fileicon_pdf.png";
    uNC = an.bvi() + "/fav_fileicon_unknow.png";
    mid = new HashMap();
    HashMap localHashMap = new HashMap();
    mid = localHashMap;
    localHashMap.put("avi", uNt);
    mid.put("m4v", uNt);
    mid.put("vob", uNt);
    mid.put("mpeg", uNt);
    mid.put("mpe", uNt);
    mid.put("asx", uNt);
    mid.put("asf", uNt);
    mid.put("f4v", uNt);
    mid.put("flv", uNt);
    mid.put("mkv", uNt);
    mid.put("wmv", uNt);
    mid.put("wm", uNt);
    mid.put("3gp", uNt);
    mid.put("mp4", uNt);
    mid.put("rmvb", uNt);
    mid.put("rm", uNt);
    mid.put("ra", uNt);
    mid.put("ram", uNt);
    mid.put("mp3pro", uNu);
    mid.put("vqf", uNu);
    mid.put("cd", uNu);
    mid.put("md", uNu);
    mid.put("mod", uNu);
    mid.put("vorbis", uNu);
    mid.put("au", uNu);
    mid.put("amr", uNu);
    mid.put("silk", uNu);
    mid.put("wma", uNu);
    mid.put("mmf", uNu);
    mid.put("mid", uNu);
    mid.put("midi", uNu);
    mid.put("mp3", uNu);
    mid.put("aac", uNu);
    mid.put("ape", uNu);
    mid.put("aiff", uNu);
    mid.put("aif", uNu);
    mid.put("jfif", uNv);
    mid.put("tiff", uNv);
    mid.put("tif", uNv);
    mid.put("jpe", uNv);
    mid.put("dib", uNv);
    mid.put("jpeg", uNv);
    mid.put("jpg", uNv);
    mid.put("png", uNv);
    mid.put("bmp", uNv);
    mid.put("gif", uNv);
    mid.put("rar", uNw);
    mid.put("zip", uNw);
    mid.put("7z", uNw);
    mid.put("iso", uNw);
    mid.put("cab", uNw);
    mid.put("doc", uNx);
    mid.put("docx", uNx);
    mid.put("ppt", uNy);
    mid.put("pptx", uNy);
    mid.put("xls", uNz);
    mid.put("xlsx", uNz);
    mid.put("txt", uNA);
    mid.put("rtf", uNA);
    mid.put("pdf", uNB);
    mid.put("unknown", uNC);
    uND = new String[] { "<div>", "<div/>", "<object", "<br", "</" };
    uNE = new String[] { "＜div>", "＜div/>", "＜object", "＜br", "＜/" };
    uNF = null;
    uNG = "";
    AppMethodBeat.o(26646);
  }

  public static void JW(int paramInt)
  {
    AppMethodBeat.i(26643);
    uNF = null;
    uNG = "";
    Object localObject1 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().deu();
    uNG = (String)localObject1;
    Object localObject2 = new LinkedList();
    localObject1 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().ahe((String)localObject1);
    if ((localObject1 == null) || (((abf)localObject1).wiv.size() <= 1))
      localObject2 = null;
    while (true)
    {
      uNF = (LinkedList)localObject2;
      localObject2 = new b(paramInt, 1, uNG, uNF, null);
      aw.Rg().a((m)localObject2, 0);
      AppMethodBeat.o(26643);
      return;
      Iterator localIterator = ((abf)localObject1).wiv.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (aar)localIterator.next();
        Object localObject3 = f.o((aar)localObject1);
        if ((!bo.isNullOrNil((String)localObject3)) && (((aar)localObject1).dataType == 2) && (e.ct((String)localObject3)))
        {
          localObject3 = new abd();
          ((abd)localObject3).Md5 = ((aar)localObject1).wgq;
          ((abd)localObject3).AesKey = ((aar)localObject1).wgb;
          ((abd)localObject3).wip = ((aar)localObject1).wfZ;
          ((LinkedList)localObject2).add(localObject3);
        }
      }
    }
  }

  public static ArrayList<com.tencent.mm.plugin.wenote.model.a.c> a(Object paramObject, List<String> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(26642);
    if (paramObject == null)
    {
      paramObject = null;
      AppMethodBeat.o(26642);
    }
    while (true)
    {
      return paramObject;
      ArrayList localArrayList = (ArrayList)paramObject;
      paramObject = new ArrayList();
      Object localObject1 = localArrayList.iterator();
      Object localObject2;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (com.tencent.mm.plugin.wenote.model.a.c)((Iterator)localObject1).next();
        if (((com.tencent.mm.plugin.wenote.model.a.c)localObject2).getType() != 1)
          paramObject.add(localObject2);
      }
      int i = 0;
      if (i < paramList.size())
      {
        localObject1 = (String)paramList.get(i);
        if (((String)localObject1).trim().equals("<ThisisNoteNodeHrObj>"))
        {
          localObject2 = new com.tencent.mm.plugin.wenote.model.a.h();
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).uNT = false;
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).uNZ = false;
          paramObject.add(i, localObject2);
        }
        while (true)
        {
          i++;
          break;
          if (!((String)localObject1).trim().equals("<ThisisNoteNodeObj>"))
          {
            localObject2 = new i();
            ((i)localObject2).content = ((String)localObject1);
            ((i)localObject2).uNT = false;
            ((i)localObject2).uNZ = false;
            ((i)localObject2).mnd = f.agW(localObject2.toString());
            if (i < paramObject.size())
              paramObject.add(i, localObject2);
            else
              paramObject.add(localObject2);
          }
        }
      }
      if (paramBoolean)
      {
        localArrayList.clear();
        localArrayList.addAll(paramObject);
      }
      AppMethodBeat.o(26642);
    }
  }

  public static void a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    AppMethodBeat.i(26644);
    String str = com.tencent.mm.sdk.f.a.RL("jpg");
    if (paramBitmap != null);
    while (true)
    {
      try
      {
        com.tencent.mm.sdk.platformtools.d.a(paramBitmap, 100, Bitmap.CompressFormat.JPEG, str, true);
        if (!bo.isNullOrNil(str))
          com.tencent.mm.sdk.f.a.a(str, paramContext);
        paramContext = new com.tencent.mm.vfs.b(str);
        if (paramContext.exists())
        {
          long l = paramContext.length() / 1024L;
          int i = 0;
          j = 0;
          if (paramBitmap != null)
          {
            i = paramBitmap.getWidth();
            j = paramBitmap.getHeight();
            paramBitmap.recycle();
          }
          paramContext = new abd();
          paramContext.Md5 = e.atg(str);
          paramContext = new b(0, 2, uNG, uNF, paramContext);
          aw.Rg().a(paramContext, 0);
          paramContext = com.tencent.mm.plugin.report.service.h.pYm;
          if (!paramBoolean)
            break label373;
          k = 1;
          paramContext.e(14811, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(l), Integer.valueOf(0), Integer.valueOf(k) });
        }
        AppMethodBeat.o(26644);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.WNNoteLogic", localException, "", new Object[0]);
        ab.e("MicroMsg.WNNoteLogic", "save image fail, saveBitmapToImage is null");
        localObject = com.tencent.mm.plugin.report.service.h.pYm;
        if (!paramBoolean);
      }
      for (int j = 1; ; j = 0)
      {
        ((com.tencent.mm.plugin.report.service.h)localObject).e(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3), Integer.valueOf(j) });
        localObject = "";
        break;
      }
      ab.e("MicroMsg.WNNoteLogic", "save image fail, bigBitmap is null");
      Object localObject = com.tencent.mm.plugin.report.service.h.pYm;
      if (paramBoolean);
      for (j = 1; ; j = 0)
      {
        ((com.tencent.mm.plugin.report.service.h)localObject).e(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(j) });
        localObject = "";
        break;
      }
      label373: int k = 0;
    }
  }

  private static void aR(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(26635);
    le localle = new le();
    localle.cHe.type = 6;
    localle.cHe.jsonString = paramJSONObject.toString();
    localle.cHe.cGW = "";
    com.tencent.mm.sdk.b.a.xxA.m(localle);
    AppMethodBeat.o(26635);
  }

  public static void ae(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(26639);
    JSONObject localJSONObject = new JSONObject();
    paramArrayList = paramArrayList.iterator();
    String str1;
    if (paramArrayList.hasNext())
      str1 = (String)paramArrayList.next();
    while (true)
    {
      try
      {
        localJSONObject.put("type", 2);
        localJSONObject.put("downloaded", true);
        String str2 = com.tencent.mm.plugin.wenote.b.c.hs(str1, "");
        str1 = com.tencent.mm.plugin.wenote.b.c.ht(str1, "");
        if (!bo.isNullOrNil(str2))
        {
          boolean bool = bo.isNullOrNil(str1);
          if (!bool);
        }
        else
        {
          AppMethodBeat.o(26639);
          return;
        }
        localJSONObject.put("bigImagePath", str2);
        localJSONObject.put("localPath", str1);
        aR(localJSONObject);
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.WNNoteLogic", localJSONException, "", new Object[0]);
      }
      break;
      AppMethodBeat.o(26639);
    }
  }

  public static void agY(String paramString)
  {
    AppMethodBeat.i(26637);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(26637);
    while (true)
    {
      return;
      if (!e.ct(paramString))
      {
        AppMethodBeat.o(26637);
      }
      else
      {
        com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(paramString);
        if (!localb.exists())
        {
          AppMethodBeat.o(26637);
        }
        else
        {
          JSONObject localJSONObject = new JSONObject();
          try
          {
            localJSONObject.put("type", 5);
            localJSONObject.put("downloaded", true);
            localJSONObject.put("title", localb.getName());
            localJSONObject.put("content", f.aC((float)localb.length()));
            localJSONObject.put("iconPath", aha(e.cv(paramString)));
            localJSONObject.put("localPath", paramString);
            aR(localJSONObject);
            AppMethodBeat.o(26637);
          }
          catch (JSONException paramString)
          {
            ab.printErrStackTrace("MicroMsg.WNNoteLogic", paramString, "", new Object[0]);
            AppMethodBeat.o(26637);
          }
        }
      }
    }
  }

  public static void agZ(String paramString)
  {
    AppMethodBeat.i(26638);
    ab.i("MicroMsg.WNNoteLogic", "insert location run");
    JSONObject localJSONObject = new JSONObject(paramString);
    ab.i("MicroMsg.WNNoteLogic", "insert location run :after invoke");
    paramString = new com.tencent.mm.pluginsdk.location.b(-1L, (float)localJSONObject.getDouble("lat"), (float)localJSONObject.getDouble("lng"), localJSONObject.getInt("scale"), 1);
    paramString = g.x(paramString.toString().getBytes());
    paramString = an.bvk() + "/" + paramString + ".png";
    ab.i("MicroMsg.WNNoteLogic", "insert location run :filepath:%s", new Object[] { paramString });
    if (e.ct(paramString))
      ab.i("MicroMsg.WNNoteLogic", "insert location run :filepath:is exsit");
    if (e.ct(paramString))
      ab.i("MicroMsg.WNNoteLogic", "fileExist suc, use getimagelocalpath");
    while (true)
    {
      localJSONObject.put("localPath", paramString);
      aR(localJSONObject);
      AppMethodBeat.o(26638);
      return;
      ab.e("MicroMsg.WNNoteLogic", "Temp file fileExist fail:%s ,use default file", new Object[] { paramString });
      paramString = d.uNe;
    }
  }

  public static String aha(String paramString)
  {
    AppMethodBeat.i(26641);
    paramString = (String)mid.get(paramString);
    if (paramString == null)
    {
      paramString = (String)mid.get("unknown");
      AppMethodBeat.o(26641);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(26641);
    }
  }

  public static void bq(Context paramContext, String paramString)
  {
    AppMethodBeat.i(26640);
    JSONObject localJSONObject = new JSONObject();
    int i;
    int j;
    if (!bo.isNullOrNil(paramString))
    {
      i = (int)k.ddK().duration;
      j = (int)f.fY(i);
    }
    try
    {
      localJSONObject.put("downloaded", true);
      localJSONObject.put("length", i);
      localJSONObject.put("lengthStr", f.K(paramContext, j));
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>();
      localJSONObject.put("iconPath", an.bvi() + "/fav_fileicon_recording.png");
      localJSONObject.put("localPath", paramString);
    }
    catch (JSONException paramContext)
    {
      try
      {
        while (true)
        {
          localJSONObject.put("type", 4);
          i = k.ddK().uNO;
          paramContext = new le();
          paramContext.cHe.type = 6;
          paramContext.cHe.jsonString = localJSONObject.toString();
          paramContext.cHe.cGW = Integer.toString(i);
          com.tencent.mm.sdk.b.a.xxA.m(paramContext);
          AppMethodBeat.o(26640);
          return;
          paramContext = paramContext;
          ab.printErrStackTrace("MicroMsg.WNNoteLogic", paramContext, "", new Object[0]);
        }
      }
      catch (JSONException paramContext)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.WNNoteLogic", paramContext, "", new Object[0]);
      }
    }
  }

  public static void br(Context paramContext, String paramString)
  {
    AppMethodBeat.i(26645);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.WNNoteLogic", "dofavnotelink , but localid is null or nil");
      AppMethodBeat.o(26645);
    }
    while (true)
    {
      return;
      cl localcl = new cl();
      sc localsc = new sc();
      localsc.cNZ.cOc = paramString;
      localsc.cNZ.cOd = localcl;
      localsc.cNZ.url = "";
      com.tencent.mm.sdk.b.a.xxA.m(localsc);
      if (!localsc.cOa.cvi)
      {
        if (localcl.cvA.cvG == 0)
          localcl.cvA.cvG = 2131299630;
        com.tencent.mm.ui.base.h.g(paramContext, localcl.cvA.cvG, 0);
        AppMethodBeat.o(26645);
      }
      else
      {
        localcl.cvA.activity = ((Activity)paramContext);
        localcl.cvA.cvH = 28;
        com.tencent.mm.sdk.b.a.xxA.m(localcl);
        AppMethodBeat.o(26645);
      }
    }
  }

  public static void q(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(26636);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(26636);
    while (true)
    {
      return;
      if (!e.ct(paramString))
      {
        AppMethodBeat.o(26636);
      }
      else
      {
        paramString = new JSONObject();
        long l = paramInt;
        try
        {
          paramInt = (int)f.fY(l);
          paramString.put("type", 4);
          paramString.put("downloaded", true);
          paramString.put("length", paramInt);
          paramString.put("lengthStr", f.K(paramContext, paramInt));
          paramContext = new java/lang/StringBuilder;
          paramContext.<init>();
          paramString.put("iconPath", an.bvi() + "/fav_fileicon_recording.png");
          aR(paramString);
          AppMethodBeat.o(26636);
        }
        catch (JSONException paramContext)
        {
          ab.printErrStackTrace("MicroMsg.WNNoteLogic", paramContext, "", new Object[0]);
          AppMethodBeat.o(26636);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.h
 * JD-Core Version:    0.6.2
 */