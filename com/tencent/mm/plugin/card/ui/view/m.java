package com.tencent.mm.plugin.card.ui.view;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.q;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.i;
import com.tencent.mm.plugin.card.model.j;
import com.tencent.mm.plugin.card.model.k;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;

public final class m extends g
{
  public final ab beA()
  {
    AppMethodBeat.i(88761);
    t localt = new t(this, this.jiE);
    AppMethodBeat.o(88761);
    return localt;
  }

  public final ab bey()
  {
    AppMethodBeat.i(88759);
    n localn = new n(this, this.jiE);
    AppMethodBeat.o(88759);
    return localn;
  }

  public final ab bez()
  {
    AppMethodBeat.i(88760);
    f localf = new f(this, this.jiE);
    AppMethodBeat.o(88760);
    return localf;
  }

  public final String e(com.tencent.mm.plugin.card.d.c paramc)
  {
    AppMethodBeat.i(88758);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CarDynamicCodeView", "code from dynamic offline");
    com.tencent.mm.plugin.card.b.g localg = am.bbm();
    Object localObject1 = this.kaS;
    Object localObject2 = "";
    if (localObject1 == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "get code is failure! cardInfo is null");
      paramc = (com.tencent.mm.plugin.card.d.c)localObject2;
    }
    while (true)
    {
      AppMethodBeat.o(88758);
      while (true)
      {
        return paramc;
        localg.bao();
        localg.kaZ = paramc;
        localObject3 = ((b)localObject1).aZZ();
        localObject2 = am.bbk().bSd.rawQuery("select count(1) from CardQrCodeDataInfo where card_id =? AND status=0", new String[] { localObject3 });
        int i;
        if (localObject2 != null)
        {
          ((Cursor)localObject2).moveToFirst();
          i = ((Cursor)localObject2).getInt(0);
          ((Cursor)localObject2).close();
          label117: if (i != 0)
            break label169;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "can not getFrom db！db is empty!");
          i = 0;
        }
        while (true)
        {
          if (i != 0)
            break label273;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "can not getFrom db！ request doNetSceneGetDynamicQrcode!");
          localg.a((b)localObject1, q.krX);
          paramc = "";
          AppMethodBeat.o(88758);
          break;
          i = 0;
          break label117;
          label169: localObject2 = am.bbl().Gv((String)localObject3);
          if (localObject2 != null)
          {
            if (com.tencent.mm.plugin.card.b.g.a((i)localObject2))
            {
              localg.kaZ = com.tencent.mm.plugin.card.d.c.krB;
              i = 0;
            }
            else if ((i < ((i)localObject2).field_lower_bound) && (com.tencent.mm.plugin.card.d.l.isNetworkAvailable(ah.getContext())))
            {
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "can not getFrom db！ currentCodeSize < lower_bound,currentCodeSize =%d,lower_bound=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(((i)localObject2).field_lower_bound) });
              localg.kaZ = com.tencent.mm.plugin.card.d.c.krH;
              i = 0;
            }
          }
          else
            i = 1;
        }
        label273: localObject2 = am.bbk().Gx(((b)localObject1).aZZ());
        if (localObject2 != null)
          break;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get code is failure! db is  empty! doNetSceneGetDynamicQrcode! cardId= %s", new Object[] { ((b)localObject1).aZZ() });
        localg.a((b)localObject1, q.krX);
        paramc = "";
        AppMethodBeat.o(88758);
      }
      k localk = am.bbk().Gy((String)localObject3);
      if ((localk != null) && (am.bbk().dm((String)localObject3, localk.field_code_id)))
        localg.a((String)localObject3, localk.field_code_id, paramc);
      localg.exv = 0;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "update current code showing! newQrCodeData cardId= %s,codeId=%s，refreshReason=%d", new Object[] { localObject3, ((k)localObject2).field_code_id, Integer.valueOf(paramc.action) });
      Object localObject3 = ((b)localObject1).aZZ();
      if (localObject2 == null)
        paramc = "";
      while (true)
      {
        if (!bo.isNullOrNil(paramc))
          break label536;
        localg.R(1, "");
        paramc = "";
        AppMethodBeat.o(88758);
        break;
        paramc = com.tencent.mm.plugin.card.d.e.ds((String)localObject3, ((k)localObject2).field_code);
        localObject3 = am.bbl().Gv((String)localObject3);
        if ((localObject3 != null) && (!bo.isNullOrNil(paramc)) && (((i)localObject3).field_need_insert_show_timestamp) && (!bo.isNullOrNil(((i)localObject3).field_show_timestamp_encrypt_key)))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "getCodeData is need insert show timestamp! code signTimestamp!");
          paramc = com.tencent.mm.plugin.card.d.e.du(paramc, ((i)localObject3).field_show_timestamp_encrypt_key);
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "getCodeData only decrypt qrcode!");
        }
      }
      label536: ((k)localObject2).field_status = 1;
      if (!am.bbk().c((com.tencent.mm.sdk.e.c)localObject2, new String[] { "card_id", "code_id" }))
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardQrCodeDataInfoStorage", "update qrCodeData  failure! card_id = %s, code_id = %s ,status = %d", new Object[] { ((k)localObject2).field_card_id, ((k)localObject2).field_code_id, Integer.valueOf(((k)localObject2).field_status) });
      while (true)
      {
        localObject2 = am.bbm();
        localObject1 = ((b)localObject1).aZZ();
        localObject1 = am.bbl().Gv((String)localObject1);
        if (localObject1 != null)
          break label686;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "startRequestCodeTimer failure! CardQrCodeConfi is null!");
        break;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardQrCodeDataInfoStorage", "update qrCodeData  success! card_id = %s, code_id = %s ,status = %d", new Object[] { ((k)localObject2).field_card_id, ((k)localObject2).field_code_id, Integer.valueOf(((k)localObject2).field_status) });
      }
      label686: long l = ((i)localObject1).field_show_expire_interval * 1000;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "startRefreshCodeTimer refreshTime: ".concat(String.valueOf(l)));
      ((com.tencent.mm.plugin.card.b.g)localObject2).kba.ae(l, l);
    }
  }

  public final boolean f(b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(88757);
    if (this.kaS == null)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
      AppMethodBeat.o(88757);
    }
    while (true)
    {
      return bool;
      if (paramb == null)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
        AppMethodBeat.o(88757);
        bool = false;
      }
      else if (this.kaS.aZW().vSq != paramb.aZW().vSq)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain is_commom_card is different！");
        AppMethodBeat.o(88757);
      }
      else
      {
        tm localtm1 = this.kaS.aZW().vSp;
        tm localtm2 = paramb.aZW().vSp;
        if (((localtm1 == null) && (localtm2 != null)) || ((localtm1 != null) && (localtm2 == null)))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain unavailable_qrcode_field is different！");
          AppMethodBeat.o(88757);
        }
        else if ((localtm1 != null) && (localtm2 != null) && (localtm1.title != null) && (localtm2.title != null) && (localtm1.title.equals(localtm2.title)))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain unavailable_qrcode_field title is different！");
          AppMethodBeat.o(88757);
        }
        else
        {
          localtm1 = this.kaS.aZV().vUA;
          paramb = paramb.aZV().vUA;
          if (((localtm1 == null) && (paramb != null)) || ((localtm1 != null) && (paramb == null)))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field  is diffrent！");
            AppMethodBeat.o(88757);
          }
          else if ((localtm1 != null) && (paramb != null) && (localtm1.title != null) && (paramb.title != null) && (!localtm1.title.equals(paramb.title)))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field title is diffrent！");
            AppMethodBeat.o(88757);
          }
          else if ((localtm1 != null) && (paramb != null) && (localtm1.kbX != null) && (paramb.kbX != null) && (!localtm1.kbX.equals(paramb.kbX)))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field aux_title  is diffrent！");
            AppMethodBeat.o(88757);
          }
          else
          {
            AppMethodBeat.o(88757);
            bool = false;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.m
 * JD-Core Version:    0.6.2
 */