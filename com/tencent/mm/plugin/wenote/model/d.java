package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.g.a.ld;
import com.tencent.mm.g.a.ld.a;
import com.tencent.mm.plugin.fav.a.an;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.a.j;
import com.tencent.mm.plugin.wenote.model.a.k;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.a.m;
import com.tencent.mm.plugin.wenote.model.a.n;
import com.tencent.mm.plugin.wenote.model.a.o;
import com.tencent.mm.plugin.wenote.model.a.p;
import com.tencent.mm.plugin.wenote.model.a.r;
import com.tencent.mm.plugin.wenote.model.a.s;
import com.tencent.mm.plugin.wenote.model.a.t;
import com.tencent.mm.plugin.wenote.model.a.u;
import com.tencent.mm.plugin.wenote.model.a.v;
import com.tencent.mm.plugin.wenote.model.a.w;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.List<Lcom.tencent.mm.protocal.protobuf.aar;>;
import org.json.JSONArray;

public abstract class d
{
  public static String uMW = "";
  public static HashMap<String, JSONArray> uMX = new HashMap();
  public static boolean uNa = false;
  public static String uNb = an.bvi() + "/fav_fileicon_recording.png";
  private static String uNc = an.bvi() + "/ofm_file_icon.png";
  private static String uNd = an.bvi() + "/app_attach_file_icon_pic.png";
  public static String uNe = an.bvi() + "/location_msg.png";
  public static String uNf = an.bvi() + "/note_fav_not_support.png";
  public m uMP = null;
  public com.tencent.mm.plugin.fav.a.g uMQ;
  public HashMap<String, w> uMR = new HashMap();
  public HashMap<String, String> uMS = new HashMap();
  public HashMap<String, o> uMT = new HashMap();
  public String uMU = "WeNote_0";
  public String uMV = "";
  public boolean uMY = false;
  public abf uMZ = new abf();

  public static abf a(String paramString, List<o> paramList, aar paramaar)
  {
    LinkedList localLinkedList = new LinkedList();
    abf localabf = new abf();
    if (paramaar != null)
      localLinkedList.add(paramaar);
    while (true)
    {
      Object localObject1 = paramList.iterator();
      while (true)
      {
        if (!((Iterator)localObject1).hasNext())
          break label877;
        paramaar = (o)((Iterator)localObject1).next();
        if (paramaar != null)
        {
          if (paramaar.uOn == null)
            break;
          localLinkedList.add(paramaar.uOn);
        }
      }
      if ((!bo.isNullOrNil(paramString)) && (paramString.length() > 0))
      {
        paramString = an.bvl();
        localObject1 = new aar();
        ((aar)localObject1).LE(8);
        ((aar)localObject1).ale("WeNoteHtmlFile");
        ((aar)localObject1).oY(true);
        ((aar)localObject1).mf(e.asZ(paramString));
        ((aar)localObject1).akR(".htm");
        localLinkedList.add(localObject1);
        paramaar = f.o((aar)localObject1);
        if (!e.ct(paramaar))
          e.y(paramString, paramaar);
        ((aar)localObject1).akV(paramaar);
      }
    }
    paramString = new aar();
    Object localObject2 = new aas();
    Object localObject3 = new aat();
    ((aat)localObject3).LI(6);
    ((aas)localObject2).c((aat)localObject3);
    paramString.a((aas)localObject2);
    switch (paramaar.type)
    {
    default:
    case 2:
    case 3:
    case 5:
    case 4:
    case 6:
    case 1:
    }
    while (true)
    {
      paramString.ale(paramaar.uOo);
      localLinkedList.add(paramString);
      break;
      paramString.LE(2);
      localObject2 = (p)paramaar;
      localObject3 = ((p)localObject2).uOq;
      paramString.akV((String)localObject3);
      if (!bo.isNullOrNil(((p)paramaar).mnd))
      {
        paramString.akU(paramaar.mnd);
        paramString.akW(((p)localObject2).cHg);
      }
      while (true)
      {
        paramString.LE(2);
        break;
        paramString.akU(f.agW(localObject2.toString()));
        com.tencent.mm.sdk.platformtools.d.c((String)localObject3, 150, 150, Bitmap.CompressFormat.JPEG, 90, f.c(paramString));
        paramString.akW(f.c(paramString));
      }
      paramString.LE(6);
      localObject2 = (s)paramaar;
      paramString.akU(paramaar.mnd);
      localObject3 = new aay();
      ((aay)localObject3).alu(((s)localObject2).fBg);
      ((aay)localObject3).E(((s)localObject2).lat);
      ((aay)localObject3).D(((s)localObject2).lng);
      ((aay)localObject3).LJ((int)((s)localObject2).scale);
      ((aay)localObject3).alv(((s)localObject2).eUu);
      paramString.oX(true);
      paramString.oY(true);
      paramString.wgT.a((aay)localObject3);
      continue;
      paramString.LE(8);
      localObject3 = (u)paramaar;
      paramString.akU(paramaar.mnd);
      paramString.akV(((u)localObject3).cHg);
      paramString.oY(true);
      paramString.akH(((u)localObject3).title);
      paramString.akI(((u)localObject3).content);
      paramString.akR(((u)localObject3).uOf);
      continue;
      paramString.LE(3);
      localObject2 = (v)paramaar;
      paramString.akU(paramaar.mnd);
      localObject3 = ((v)localObject2).cHg;
      if ((bo.isNullOrNil((String)localObject3)) || (((String)localObject3).length() == 0))
        break;
      paramString.akV((String)localObject3);
      paramString.LD(((v)localObject2).cAP);
      paramString.oY(true);
      paramString.akR(((v)localObject2).uOf);
      continue;
      paramString.LE(4);
      localObject3 = (k)paramaar;
      paramString.akU(paramaar.mnd);
      paramString.akV(((k)localObject3).cHg);
      paramString.akW(((k)localObject3).thumbPath);
      localObject2 = com.tencent.mm.plugin.sight.base.d.WR(((k)localObject3).cHg);
      if (localObject2 != null)
        paramString.LD(((com.tencent.mm.plugin.sight.base.a)localObject2).ckU());
      while (true)
      {
        paramString.akR(((k)localObject3).uOf);
        break;
        paramString.LD(1);
      }
      if (!uNa)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(14547, new Object[] { Integer.valueOf(6) });
        uNa = true;
      }
      paramString.LE(1);
      paramString.oX(true);
      paramString.oY(true);
      localObject3 = (i)paramaar;
      paramString.akU(paramaar.mnd);
      paramString.akI(com.tencent.mm.plugin.wenote.b.b.ahh(((i)localObject3).content));
      if ((!bo.isNullOrNil(paramString.desc)) && (paramString.desc.length() > 1000))
        paramString.akI(paramString.desc.substring(0, 1000));
    }
    label877: a(localLinkedList, paramList);
    localabf.aE(localLinkedList);
    return localabf;
  }

  private static void a(LinkedList<aar> paramLinkedList, List<o> paramList)
  {
    ab.i("MicroMsg.WNNoteBase", "do WNNoteBase.setExtraInfo");
    if (paramLinkedList.size() > 0)
    {
      int i = paramLinkedList.size();
      int j = 0;
      if (j < i)
      {
        aar localaar = (aar)paramLinkedList.get(j);
        String str1;
        Object localObject;
        if ((j > 0) && (bo.isNullOrNil(localaar.wfZ)))
        {
          localaar.akU(f.agW(localaar.toString()));
          str1 = null;
          localObject = str1;
          if (j - 1 >= 0)
          {
            localObject = str1;
            if (j - 1 < paramList.size())
            {
              localObject = str1;
              if (paramList.size() > 0)
                localObject = (o)paramList.get(j - 1);
            }
          }
          if ((localObject != null) && (((o)localObject).uOo != null) && (((o)localObject).uOo.equals(localaar.whb)))
            ((o)localObject).mnd = localaar.mnd;
        }
        if ((j > 0) && (!bo.isNullOrNil(localaar.wfZ)) && (!bo.isNullOrNil(localaar.wgb)))
        {
          localaar.oX(true);
          localaar.oY(true);
        }
        while (true)
        {
          j++;
          break;
          ab.i("MicroMsg.WNNoteBase", "datalist.get[%d].type = %d", new Object[] { Integer.valueOf(j), Integer.valueOf(localaar.dataType) });
          localObject = localaar.wgx;
          String str2;
          if (e.ct((String)localObject))
          {
            ab.i("MicroMsg.WNNoteBase", "datapath exist,pathname:%s", new Object[] { localObject });
            str2 = e.atg((String)localObject);
            str1 = com.tencent.mm.a.g.x(e.e((String)localObject, 0, 256));
            localaar.akS(str2);
            localaar.akT(str1);
            localaar.mf(new com.tencent.mm.vfs.b((String)localObject).length());
            str1 = f.o(localaar);
            boolean bool = e.ct(str1);
            if ((!((String)localObject).equals(str1)) && (!bool) && (!"WeNoteHtmlFile".equals(localaar.whb)))
              e.y((String)localObject, str1);
          }
          while (true)
          {
            localObject = localaar.wgz;
            if (!e.ct((String)localObject))
              break label515;
            ab.i("MicroMsg.WNNoteBase", "thumbPath exist,pathname:%s", new Object[] { localObject });
            str1 = e.atg((String)localObject);
            str2 = com.tencent.mm.a.g.cA((String)localObject);
            localaar.akX(str1);
            localaar.akY(str2);
            localaar.mg(new com.tencent.mm.vfs.b((String)localObject).length());
            str1 = f.c(localaar);
            if ((((String)localObject).equals(str1)) || (e.ct(str1)))
              break;
            e.y((String)localObject, str1);
            break;
            ab.e("MicroMsg.WNNoteBase", "datapath not exist, %s not exist!", new Object[] { localObject });
          }
          label515: ab.e("MicroMsg.WNNoteBase", "thumbPath not exist, pathname:%s", new Object[] { localObject });
        }
      }
    }
  }

  private void bp(Context paramContext, String paramString)
  {
    paramString = (k)this.uMT.get(paramString);
    if (bo.isNullOrNil(paramString.cHg));
    while (true)
    {
      return;
      if (e.ct(paramString.cHg))
        break label63;
      localObject = agV(paramString.mnd);
      if (localObject != null)
        break;
      ab.e("MicroMsg.WNNoteBase", "goToVideoPlay, favData is null");
    }
    n((aar)localObject);
    label63: Object localObject = new Intent();
    if (this.uMQ == null)
      ((Intent)localObject).putExtra("key_detail_info_id", 0);
    while (true)
    {
      ((Intent)localObject).putExtra("key_detail_fav_path", paramString.cHg);
      ((Intent)localObject).putExtra("key_detail_fav_thumb_path", paramString.thumbPath);
      ((Intent)localObject).putExtra("key_detail_fav_video_duration", paramString.duration);
      ((Intent)localObject).putExtra("key_detail_data_id", paramString.mnd);
      ((Intent)localObject).putExtra("key_detail_statExtStr", "");
      ((Intent)localObject).putExtra("key_detail_fav_video_show_download_status", true);
      com.tencent.mm.plugin.fav.a.b.a(paramContext, ".ui.detail.FavoriteVideoPlayUI", (Intent)localObject, 1);
      break;
      ((Intent)localObject).putExtra("key_detail_info_id", this.uMQ.field_localId);
    }
  }

  public abstract void a(aar paramaar, String paramString);

  public void agU(String paramString)
  {
  }

  public final aar agV(String paramString)
  {
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, dataId is null");
      paramString = null;
    }
    while (true)
    {
      return paramString;
      String str = (String)this.uMS.get(paramString);
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, can not find editorId by dataId: %s", new Object[] { paramString });
        paramString = null;
      }
      else
      {
        paramString = (o)this.uMT.get(str);
        if (paramString == null)
        {
          ab.e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, can not find item by editorId: %s", new Object[] { str });
          paramString = null;
        }
        else
        {
          paramString = paramString.uOn;
        }
      }
    }
  }

  public abstract String b(aar paramaar);

  public final void b(ld paramld)
  {
    if (paramld.cGU == null)
      ab.e("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, opertionevent.data is null, retutn");
    while (true)
    {
      return;
      String str = paramld.cGU.cGW;
      o localo = (o)this.uMT.get(str);
      if (localo == null)
      {
        ab.e("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, mEditorIdToDataItem.get(localEditorId) is null, retutn");
      }
      else
      {
        ab.i("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, mEditorIdToDataItem.get(localEditorId) is %d", new Object[] { Integer.valueOf(localo.type) });
        switch (localo.type)
        {
        case 4:
        default:
          break;
        case 2:
          bo(paramld.cGU.context, str);
          break;
        case 5:
          bm(paramld.cGU.context, str);
          break;
        case 3:
          bn(paramld.cGU.context, str);
          break;
        case 6:
          bp(paramld.cGU.context, str);
        }
      }
    }
  }

  public abstract void bm(Context paramContext, String paramString);

  public abstract void bn(Context paramContext, String paramString);

  public abstract void bo(Context paramContext, String paramString);

  public abstract String c(aar paramaar);

  public String ddH()
  {
    return "";
  }

  public final void ef(List<aar> paramList)
  {
    w localw = new w();
    Object localObject1 = null;
    Iterator localIterator = paramList.iterator();
    paramList = (List<aar>)localObject1;
    while (true)
    {
      label20: aar localaar;
      o localo;
      if (localIterator.hasNext())
      {
        localaar = (aar)localIterator.next();
        localo = new o();
        localo.uOo = localaar.whb;
        if (localaar.dataType == 1)
          localo.uOo = "-1";
        if (bo.isNullOrNil(localo.uOo))
        {
          ab.e("MicroMsg.WNNoteBase", "Note: DataItem.htmlid is null");
          paramList = b(localaar);
          if ((!bo.isNullOrNil(paramList)) && (e.ct(paramList)))
            f.y(this.uMP.cHh, paramList);
          while (true)
          {
            label130: return;
            n(localaar);
          }
        }
        if (localo.uOo.equals("WeNoteHtmlFile"))
        {
          localObject1 = b(localaar);
          if ((bo.isNullOrNil((String)localObject1)) || (!e.ct((String)localObject1)));
        }
      }
      try
      {
        localw.uOE = e.cy((String)localObject1);
        localObject1 = com.tencent.mm.plugin.wenote.b.b.ahg(localw.uOE);
        paramList = (List<aar>)localObject1;
        while (true)
        {
          try
          {
            ab.i("MicroMsg.WNNoteBase", "local html file exist,dataid: %s", new Object[] { localaar.mnd });
            uMX.containsKey(localw.uOE);
            ab.i("MicroMsg.WNNoteBase", "dealWNNoteInfo,WeNoteHtmlFile, cdnurl is null :%B, cdnkey is null : %B ", new Object[] { Boolean.valueOf(bo.isNullOrNil(localaar.wfZ)), Boolean.valueOf(bo.isNullOrNil(localaar.wgb)) });
          }
          catch (Exception localException1)
          {
          }
          label269: ab.printErrStackTrace("MicroMsg.WNNoteBase", localException1, "", new Object[0]);
          continue;
          n(localaar);
          localw.uOG = true;
          ab.i("MicroMsg.WNNoteBase", "local html file not exist,download htmlfile,dataid: %s", new Object[] { localaar.mnd });
          this.uMS.put(localaar.mnd, localo.uOo);
        }
        int i;
        int j;
        if (!localo.uOo.equals("-1"))
        {
          i = bo.getInt(localo.uOo.substring(7), 0);
          j = bo.getInt(this.uMU.substring(7), 0);
          localObject3 = new StringBuilder("WeNote_");
          if (j <= i)
            break label633;
        }
        label633: for (Object localObject2 = String.valueOf(j); ; localObject2 = String.valueOf(i))
        {
          this.uMU = ((String)localObject2);
          localo.mnd = localaar.mnd;
          switch (localaar.dataType)
          {
          default:
            if (localaar.dataType <= 0)
              break label20;
            localObject2 = new j();
            ((n)localObject2).uOo = localo.uOo;
            ((n)localObject2).type = 0;
            ((n)localObject2).mnd = localo.mnd;
            ((n)localObject2).uOn = localaar;
            localObject3 = b(localaar);
            ((n)localObject2).uOp = true;
            ((n)localObject2).cHg = ((String)localObject3);
            ((n)localObject2).hNN = uNf;
            ((n)localObject2).title = ah.getContext().getResources().getString(2131299706);
            ((n)localObject2).content = ah.getContext().getResources().getString(2131299674);
            localw.uOF.add(localObject2);
            this.uMT.put(localo.uOo, localObject2);
            break label20;
          case 1:
          case 2:
          case 3:
          case 20:
          case 6:
          case 8:
          case 4:
          }
        }
        if (bo.isNullOrNil(localaar.desc))
          continue;
        if ((localw.uOF.size() > 0) && (localw.uOF.get(localw.uOF.size() - 1) != null) && (((o)localw.uOF.get(localw.uOF.size() - 1)).uOo.equals("-1")))
        {
          localObject2 = (t)localw.uOF.get(localw.uOF.size() - 1);
          ((t)localObject2).content += localaar.desc;
          continue;
        }
        localObject2 = new i();
        ((t)localObject2).uOo = localo.uOo;
        ((t)localObject2).content = localaar.desc;
        localw.uOF.add(localObject2);
        continue;
        Object localObject3 = new com.tencent.mm.plugin.wenote.model.a.f();
        ((p)localObject3).uOo = localo.uOo;
        ((p)localObject3).type = 2;
        ((p)localObject3).mnd = localo.mnd;
        ((p)localObject3).uOn = localaar;
        Object localObject4 = b(localaar);
        if (bo.isNullOrNil((String)localObject4))
          continue;
        String str = (String)localObject4 + "_bigthumb";
        localObject2 = c(localaar);
        if (!e.ct((String)localObject2))
          a(localaar, (String)localObject2);
        if (e.ct((String)localObject4))
        {
          ((p)localObject3).uOp = true;
          com.tencent.mm.plugin.wenote.b.c.ht((String)localObject4, str);
        }
        while (true)
        {
          ((p)localObject3).cHg = str;
          ((p)localObject3).uOq = ((String)localObject4);
          localw.uOF.add(localObject3);
          this.uMT.put(localo.uOo, localObject3);
          break;
          n(localaar);
          ((p)localObject3).uOp = false;
          this.uMS.put(localaar.mnd, localo.uOo);
        }
        if (localaar.dataType == 20)
        {
          localObject3 = new com.tencent.mm.plugin.wenote.model.a.b();
          localObject2 = localObject3;
          if (!bo.isNullOrNil(localaar.wfZ))
          {
            ((com.tencent.mm.plugin.wenote.model.a.b)localObject3).qxI = true;
            localObject2 = localObject3;
          }
          label1047: ((v)localObject2).uOo = localo.uOo;
          ((v)localObject2).type = 4;
          ((v)localObject2).mnd = localo.mnd;
          ((v)localObject2).uOn = localaar;
          localObject3 = b(localaar);
          if ((bo.isNullOrNil((String)localObject3)) || (!e.ct((String)localObject3)))
            break label1257;
          ((v)localObject2).uOp = true;
          ((v)localObject2).hNN = uNb;
          ((v)localObject2).length = ((int)f.fY(localaar.duration));
        }
        while (true)
        {
          ((v)localObject2).cHg = ((String)localObject3);
          ((v)localObject2).uOC = f.K(ah.getContext(), (int)f.fY(localaar.duration));
          ((v)localObject2).cAP = localaar.duration;
          localObject3 = new gh();
          ((gh)localObject3).cAH.type = 17;
          ((gh)localObject3).cAH.cAJ = localaar;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
          ((v)localObject2).cAO = ((gh)localObject3).cAI.ret;
          ((v)localObject2).uOf = localaar.wgo;
          localw.uOF.add(localObject2);
          this.uMT.put(localo.uOo, localObject2);
          break;
          localObject2 = new l();
          break label1047;
          label1257: n(localaar);
          ((v)localObject2).uOp = false;
          ((v)localObject2).uOD = ah.getContext().getString(2131299769);
          this.uMS.put(localaar.mnd, localo.uOo);
        }
        localObject3 = new r();
        ((r)localObject3).cEB = ((float)localaar.wgT.why.lat);
        ((r)localObject3).fFz = ((float)localaar.wgT.why.lng);
        ((r)localObject3).cED = localaar.wgT.why.cED;
        ((r)localObject3).uOy = localaar.wgT.why.label;
        ((r)localObject3).uOz = localaar.wgT.why.cIK;
        ((r)localObject3).uOA = localaar.whb;
        localObject2 = new com.tencent.mm.plugin.wenote.model.a.g();
        ((s)localObject2).uOo = localo.uOo;
        ((s)localObject2).type = 3;
        ((s)localObject2).mnd = localo.mnd;
        ((s)localObject2).uOn = localaar;
        ((s)localObject2).uOp = true;
        ((s)localObject2).eUu = ((r)localObject3).uOz;
        ((s)localObject2).fBg = ((r)localObject3).uOy;
        ((s)localObject2).lat = ((r)localObject3).cEB;
        ((s)localObject2).lng = ((r)localObject3).fFz;
        ((s)localObject2).scale = ((r)localObject3).cED;
        ((s)localObject2).cHg = "";
        localw.uOF.add(localObject2);
        this.uMT.put(localo.uOo, localObject2);
        continue;
        localObject3 = new com.tencent.mm.plugin.wenote.model.a.d();
        ((u)localObject3).uOo = localo.uOo;
        ((u)localObject3).type = 5;
        ((u)localObject3).mnd = localo.mnd;
        ((u)localObject3).uOn = localaar;
        localObject2 = b(localaar);
        if ((!bo.isNullOrNil((String)localObject2)) && (e.ct((String)localObject2)))
        {
          ((u)localObject3).uOp = true;
          ((u)localObject3).cHg = ((String)localObject2);
        }
        while (true)
        {
          ((u)localObject3).hNN = h.aha(localaar.wgo);
          ((u)localObject3).title = localaar.title;
          ((u)localObject3).content = localaar.desc;
          ((u)localObject3).uOf = localaar.wgo;
          if (bo.isNullOrNil(((u)localObject3).content))
            ((u)localObject3).content = f.aC((float)localaar.wgu);
          localw.uOF.add(localObject3);
          this.uMT.put(localo.uOo, localObject3);
          break;
          ((u)localObject3).uOp = false;
          this.uMS.put(localaar.mnd, localo.uOo);
        }
        localObject3 = new k();
        ((k)localObject3).uOo = localo.uOo;
        ((k)localObject3).type = 6;
        ((k)localObject3).mnd = localo.mnd;
        ((k)localObject3).uOn = localaar;
        if (localaar != null)
          ((k)localObject3).duration = localaar.duration;
        ((k)localObject3).thumbPath = c(localaar);
        localObject2 = b(localaar);
        ((k)localObject3).cHg = ((String)localObject2);
        if ((!bo.isNullOrNil(((k)localObject3).thumbPath)) && (!e.ct(((k)localObject3).thumbPath)))
        {
          if (!e.ct((String)localObject2))
            break label1935;
          localObject4 = com.tencent.mm.plugin.fav.ui.c.LY((String)localObject2);
          if (localObject4 == null);
        }
        while (true)
        {
          try
          {
            ab.i("MicroMsg.WNNoteBase", "add fav service: create thumbpath bitmap, saveBitmapToImage ");
            com.tencent.mm.pluginsdk.i.f.a((Bitmap)localObject4, Bitmap.CompressFormat.JPEG, ((k)localObject3).thumbPath, true);
            if ((bo.isNullOrNil((String)localObject2)) || (!e.ct((String)localObject2)))
              break label1986;
            ((k)localObject3).uOp = true;
            localw.uOF.add(localObject3);
            this.uMT.put(localo.uOo, localObject3);
          }
          catch (Exception localException3)
          {
            ab.printErrStackTrace("MicroMsg.WNNoteBase", localException3, "", new Object[0]);
            continue;
          }
          label1935: a(localaar, ((k)localObject3).thumbPath);
          this.uMS.put(localaar.mnd + "_t", localo.uOo);
          continue;
          label1986: ((k)localObject3).uOp = false;
          this.uMS.put(localaar.mnd, localo.uOo);
        }
        if ((paramList != null) && (paramList.size() > 0))
          h.a(localw.uOF, paramList, true);
        if (this.uMP.cvx == -1L)
        {
          this.uMR.put(Long.toString(this.uMP.cHh), localw);
          break label130;
        }
        this.uMR.put(Long.toString(this.uMP.cvx), localw);
      }
      catch (Exception localException2)
      {
        break label269;
      }
    }
  }

  public abstract void n(aar paramaar);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.d
 * JD-Core Version:    0.6.2
 */