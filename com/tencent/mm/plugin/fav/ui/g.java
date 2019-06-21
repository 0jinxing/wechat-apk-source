package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ld;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.h.a;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.protocal.protobuf.aap;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.protocal.protobuf.aaz;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;

public final class g
{
  private static String LZ(String paramString)
  {
    AppMethodBeat.i(74032);
    paramString = paramString.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll(" ", "&nbsp;");
    AppMethodBeat.o(74032);
    return paramString;
  }

  private static String a(Context paramContext, aar paramaar)
  {
    AppMethodBeat.i(74033);
    switch (paramaar.dataType)
    {
    default:
      paramContext = paramaar.desc;
      AppMethodBeat.o(74033);
    case 5:
    case 17:
    case 19:
    case 16:
    case 20:
    case 7:
    }
    while (true)
    {
      return paramContext;
      Object localObject = "";
      paramContext = (Context)localObject;
      if (paramaar.wgT != null)
      {
        paramContext = (Context)localObject;
        if (paramaar.wgT.whw != null)
          paramContext = paramaar.wgT.whw.link;
      }
      if (bo.isNullOrNil(paramContext))
      {
        paramContext = paramaar.wgg;
        AppMethodBeat.o(74033);
        continue;
      }
      AppMethodBeat.o(74033);
      continue;
      paramContext = paramContext.getString(2131297030);
      AppMethodBeat.o(74033);
      continue;
      paramContext = paramContext.getString(2131296528);
      try
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        paramaar = paramContext + " " + paramaar.wgT.whN.wfO;
        paramContext = paramaar;
        label202: AppMethodBeat.o(74033);
        continue;
        paramContext = paramContext.getString(2131296947);
        try
        {
          com.tencent.mm.kernel.g.RQ();
          localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Rn(paramaar.desc);
          paramaar = new java/lang/StringBuilder;
          paramaar.<init>();
          paramaar = paramContext + " " + ((bi.a)localObject).nickname;
          paramContext = paramaar;
          label275: AppMethodBeat.o(74033);
        }
        catch (Exception paramaar)
        {
          break label275;
        }
        paramContext = paramContext.getString(2131297079) + " " + j.B(paramContext, paramaar.duration / 1000) + "\n";
        AppMethodBeat.o(74033);
        continue;
        localObject = paramaar.desc;
        paramContext = (Context)localObject;
        if (!bo.isNullOrNil(paramaar.title))
          paramContext = paramaar.title + " " + (String)localObject;
        AppMethodBeat.o(74033);
      }
      catch (Exception paramaar)
      {
        break label202;
      }
    }
  }

  private static void a(com.tencent.mm.plugin.fav.a.g paramg, int paramInt, String paramString)
  {
    AppMethodBeat.i(74034);
    aar localaar = new aar();
    localaar.LE(1);
    localaar.akI(paramString);
    paramg.field_favProto.wiv.add(paramInt, localaar);
    AppMethodBeat.o(74034);
  }

  public static void a(MMActivity paramMMActivity, long paramLong, h.a parama)
  {
    AppMethodBeat.i(74031);
    try
    {
      com.tencent.mm.plugin.fav.a.g localg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramLong);
      com.tencent.mm.plugin.report.service.h.pYm.e(15378, new Object[] { Integer.valueOf(localg.field_id), Integer.valueOf(localg.field_type) });
      ab.d("fav.FavNoteConvertLogic", "report 15378, id:%s, type:%s", new Object[] { Integer.valueOf(localg.field_id), Integer.valueOf(localg.field_type) });
      localg.field_flag = 0;
      localg.field_updateTime = System.currentTimeMillis();
      localg.field_localId = -1L;
      localg.field_sourceType = 6;
      if (localg.field_favProto.wit != null)
      {
        localg.field_favProto.wit.alF("");
        localg.field_favProto.wit.LN(6);
        localg.field_favProto.wit.alD(r.Yz());
      }
      localg.field_fromUser = r.Yz();
      Object localObject1;
      if (localg.field_type == 1)
      {
        localObject1 = new java/util/LinkedList;
        ((LinkedList)localObject1).<init>();
        localg.field_favProto.aE((LinkedList)localObject1);
        a(localg, 0, LZ(localg.field_favProto.desc));
      }
      Object localObject2;
      Object localObject3;
      while (localg.field_favProto.wiv == null)
      {
        localg.field_localId = System.currentTimeMillis();
        localg.field_type = 18;
        localg.field_xml = com.tencent.mm.plugin.fav.a.g.s(localg);
        localObject1 = new com/tencent/mm/protocal/protobuf/abh;
        ((abh)localObject1).<init>();
        if (parama != null)
        {
          ((abh)localObject1).scene = parama.scene;
          ((abh)localObject1).jSW = parama.jSW;
          ((abh)localObject1).index = parama.index;
          ((abh)localObject1).query = parama.query;
          ((abh)localObject1).cvF = parama.sid;
          ((abh)localObject1).mfg = parama.mfg;
        }
        parama = new com/tencent/mm/g/a/ld;
        parama.<init>();
        parama.cGU.field_localId = localg.field_localId;
        parama.cGU.cHa = 5;
        parama.cGU.cGW = localg.field_xml;
        parama.cGU.context = paramMMActivity;
        localObject2 = new android/os/Bundle;
        ((Bundle)localObject2).<init>();
        localObject3 = localg.field_favProto.vzK;
        if (localObject3 != null)
        {
          ((Bundle)localObject2).putString("noteauthor", ((aaz)localObject3).wim);
          ((Bundle)localObject2).putString("noteeditor", ((aaz)localObject3).win);
        }
        ((Bundle)localObject2).putLong("edittime", localg.field_updateTime);
        parama.cGU.cGZ = ((Bundle)localObject2);
        parama.cGU.field_favProto = localg.field_favProto;
        parama.cGU.type = 2;
        parama.cGU.cHc = true;
        parama.cGU.cHd = ((abh)localObject1);
        a.xxA.m(parama);
        paramMMActivity.finish();
        AppMethodBeat.o(74031);
        return;
      }
      i = 1;
      j = 0;
      label518: if (j < localg.field_favProto.wiv.size())
      {
        localObject3 = (aar)localg.field_favProto.wiv.get(j);
        if ((localg.field_type != 18) || (!((aar)localObject3).whb.equals("WeNoteHtmlFile")))
        {
          localObject1 = b.b((aar)localObject3);
          localObject4 = b.c((aar)localObject3);
          ((aar)localObject3).akU(b.cf(localObject3.toString(), 18));
          localObject2 = b.b((aar)localObject3);
          String str = b.c((aar)localObject3);
          if ((!bo.isNullOrNil((String)localObject1)) && (!bo.isNullOrNil((String)localObject2)) && (e.ct((String)localObject1)))
            e.y((String)localObject1, (String)localObject2);
          if ((!bo.isNullOrNil((String)localObject4)) && (!bo.isNullOrNil(str)) && (e.ct((String)localObject4)))
            e.y((String)localObject4, str);
        }
        if (localg.field_type == 18)
          break label1152;
        if (((aar)localObject3).dataType != 1)
          break label877;
        if (localg.field_type != 14)
          break label849;
        if (((aar)localObject3).desc != null)
          break label782;
        localObject1 = "\n";
        label725: if (((aar)localObject3).wgV != null)
          break label815;
        localObject2 = "";
        label737: Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((aar)localObject3).akI(LZ((String)localObject2 + (String)localObject1 + "\n"));
      }
      label1036: 
      while (true)
      {
        j++;
        break label518;
        break;
        label782: localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((aar)localObject3).desc + "\n";
        break label725;
        label815: localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((aar)localObject3).wgV + ":\n";
        break label737;
        label849: if (!bo.isNullOrNil(((aar)localObject3).desc))
        {
          ((aar)localObject3).akI(LZ(((aar)localObject3).desc));
          continue;
          label877: localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("WeNote_");
          k = i + 1;
          ((aar)localObject3).ale(i);
          i = j;
          if (localg.field_type == 14)
          {
            i = j;
            if (((aar)localObject3).wgV != null)
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              a(localg, j, LZ(((aar)localObject3).wgV + ":"));
              i = j + 1;
            }
          }
          j = ((aar)localObject3).dataType;
          if ((j == 1) || (j == 2) || (j == 3) || (j == 6) || (j == 8) || (j == 4) || (j == 0))
          {
            j = 1;
            if (j == 0)
            {
              localg.field_favProto.wiv.remove(i);
              localObject2 = a(paramMMActivity, (aar)localObject3);
              if (localObject2 != null)
                break label1119;
            }
          }
          for (localObject1 = "\n\n"; ; localObject1 = (String)localObject2 + "\n\n")
          {
            a(localg, i, LZ((String)localObject1));
            if (((aar)localObject3).dataType != 3)
              break label1205;
            ((aar)localObject3).LE(20);
            j = i;
            i = k;
            break;
            j = 0;
            break label1036;
            label1119: localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("\n");
          }
          if (((aar)localObject3).dataType == 20)
          {
            ((aar)localObject3).akL("");
            ((aar)localObject3).akM("");
          }
        }
      }
    }
    catch (Throwable parama)
    {
      while (true)
      {
        int k;
        label1152: Toast.makeText(paramMMActivity, paramMMActivity.getString(2131299724), 0).show();
        AppMethodBeat.o(74031);
        continue;
        label1205: int j = i;
        int i = k;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.g
 * JD-Core Version:    0.6.2
 */