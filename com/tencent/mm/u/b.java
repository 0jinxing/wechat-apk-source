package com.tencent.mm.u;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.api.l;
import com.tencent.mm.bl.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.cb;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ajc;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ba;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.b.d;

public final class b
  implements com.tencent.mm.ai.f
{
  private List<com.tencent.mm.api.f> eAC;
  private b.a eAD;
  private l eAE;

  public b(List<com.tencent.mm.api.f> paramList, l paraml, b.a parama)
  {
    AppMethodBeat.i(35449);
    g.Rg().a(825, this);
    this.eAE = paraml;
    this.eAD = parama;
    this.eAC = paramList;
    AppMethodBeat.o(35449);
  }

  private static cm a(cm paramcm, String paramString)
  {
    AppMethodBeat.i(35453);
    if (paramcm == null)
    {
      ab.w("FunctionMsg.FunctionMsgFetcher", "null == raw");
      AppMethodBeat.o(35453);
    }
    int i;
    for (paramcm = null; ; paramcm = null)
    {
      return paramcm;
      i = paramString.indexOf("<addmsg");
      if (i != -1)
        break;
      ab.e("FunctionMsg.FunctionMsgFetcher", "msgContent not start with <addmsg! content is null?%s", new Object[] { Boolean.valueOf(bo.isNullOrNil(paramString)) });
      AppMethodBeat.o(35453);
    }
    Map localMap = br.z(paramString.substring(i), "addmsg");
    StringBuilder localStringBuilder = new StringBuilder();
    if (localMap.containsKey(kT(".msgid")))
    {
      i = bo.getInt((String)localMap.get(kT(".msgid")), 0);
      paramcm.ptD = i;
      localStringBuilder.append("msgid:".concat(String.valueOf(i)));
    }
    if (localMap.containsKey(kT(".newmsgid")))
    {
      long l = bo.getLong((String)localMap.get(kT(".newmsgid")), 0L);
      paramcm.ptF = l;
      localStringBuilder.append(" newMsgId:".concat(String.valueOf(l)));
    }
    if (localMap.containsKey(kT(".msgseq")))
    {
      i = bo.getInt((String)localMap.get(kT(".msgseq")), 0);
      paramcm.vEI = i;
      localStringBuilder.append(" msgSeq:".concat(String.valueOf(i)));
    }
    String str;
    if (localMap.containsKey(kT(".fromusername")))
    {
      str = (String)localMap.get(kT(".fromusername"));
      paramcm.vEB = aa.vy(str);
      localStringBuilder.append(" fromUsername:".concat(String.valueOf(str)));
    }
    if (localMap.containsKey(kT(".tousername")))
    {
      str = (String)localMap.get(kT(".tousername"));
      paramcm.vEC = aa.vy(str);
      localStringBuilder.append(" toUsername:".concat(String.valueOf(str)));
    }
    if (localMap.containsKey(kT(".msgtype")))
    {
      i = bo.getInt((String)localMap.get(kT(".msgtype")), 0);
      paramcm.nao = i;
      localStringBuilder.append(" msgType:".concat(String.valueOf(i)));
    }
    if (localMap.containsKey(kT(".status")))
    {
      i = bo.getInt((String)localMap.get(kT(".status")), 0);
      paramcm.jBT = i;
      localStringBuilder.append(" status:".concat(String.valueOf(i)));
    }
    if (localMap.containsKey(kT(".content")))
    {
      paramcm.vED = aa.vy(d.awL(paramString.substring(paramString.indexOf("<content>") + 9, paramString.indexOf("</content>"))));
      localStringBuilder.append(" msgContent:*");
    }
    while (true)
    {
      if (localMap.containsKey(kT(".msgsource")))
      {
        paramcm.vEG = d.awL(paramString.substring(paramString.indexOf("<msgsource>") + 11, paramString.indexOf("</msgsource>")));
        localStringBuilder.append(" msgSource:*");
      }
      if (localMap.containsKey(kT(".pushcontent")))
      {
        paramcm.vEH = d.awL(paramString.substring(paramString.indexOf("<pushcontent>") + 13, paramString.indexOf("</pushcontent>")));
        localStringBuilder.append(" pushContent:*");
      }
      if (localMap.containsKey(kT(".imgstatus")))
      {
        i = bo.getInt((String)localMap.get(kT(".imgstatus")), 0);
        paramcm.vEE = i;
        localStringBuilder.append(" ImgStatus:".concat(String.valueOf(i)));
      }
      if (localMap.containsKey(kT(".imgbuf")))
      {
        paramcm.vEF = aa.vz((String)localMap.get(kT(".imgbuf")));
        localStringBuilder.append(" imgBuf:*");
      }
      if (localMap.containsKey(kT(".createtime")))
      {
        i = bo.getInt((String)localMap.get(kT(".createtime")), 0);
        paramcm.pcX = i;
        localStringBuilder.append(" createTime:".concat(String.valueOf(i)));
      }
      ab.i("FunctionMsg.FunctionMsgFetcher", "[mergeAddMsg] result:%s", new Object[] { localStringBuilder.toString() });
      AppMethodBeat.o(35453);
      break;
      localStringBuilder.append(" msgContent:null");
      paramcm.vED = null;
    }
  }

  private static String kT(String paramString)
  {
    AppMethodBeat.i(35454);
    paramString = ".addmsg".concat(String.valueOf(paramString));
    AppMethodBeat.o(35454);
    return paramString;
  }

  private void release()
  {
    AppMethodBeat.i(35451);
    g.Rg().b(825, this);
    AppMethodBeat.o(35451);
  }

  public final void Pn()
  {
    AppMethodBeat.i(35450);
    Iterator localIterator = this.eAC.iterator();
    label262: 
    while (localIterator.hasNext())
    {
      Object localObject = (com.tencent.mm.api.f)localIterator.next();
      if ((localObject != null) && (((com.tencent.mm.api.f)localObject).field_cgi != null) && (((com.tencent.mm.api.f)localObject).field_cmdid > 0))
      {
        ab.i("FunctionMsg.FunctionMsgFetcher", "[fetchInternal], functionMsgId: %s", new Object[] { ((com.tencent.mm.api.f)localObject).field_functionmsgid });
        ((com.tencent.mm.api.f)localObject).field_status = 0;
        this.eAE.b(((com.tencent.mm.api.f)localObject).field_businessInfo);
        localObject = new a((com.tencent.mm.api.f)localObject);
        g.Rg().a((m)localObject, 0);
      }
      else if (localObject != null)
      {
        cm localcm = a(((com.tencent.mm.api.f)localObject).field_addMsg, ((com.tencent.mm.api.f)localObject).field_defaultContent);
        ab.i("FunctionMsg.FunctionMsgFetcher", "[fetchInternal] addMsgDefault is null? %s", new Object[] { localcm });
        ((com.tencent.mm.api.f)localObject).a(localcm);
        int i;
        if (((com.tencent.mm.api.f)localObject).field_actionTime > cb.aaD() / 1000L)
        {
          i = -2;
          label167: ((com.tencent.mm.api.f)localObject).field_status = i;
          ba localba = ba.xZa;
          ba.a(((com.tencent.mm.api.f)localObject).field_functionmsgid, (com.tencent.mm.api.f)localObject);
          if ((localcm == null) || (!this.eAC.remove(localObject)))
            break label238;
          this.eAD.a((com.tencent.mm.api.f)localObject);
        }
        while (true)
        {
          if (this.eAC.size() > 0)
            break label262;
          release();
          break;
          i = 2;
          break label167;
          label238: if (this.eAC.remove(localObject))
            this.eAD.b((com.tencent.mm.api.f)localObject);
        }
      }
    }
    AppMethodBeat.o(35450);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(35452);
    if (paramm.getType() != 825)
    {
      AppMethodBeat.o(35452);
      return;
    }
    paramm = (a)paramm;
    ajc localajc = paramm.gcx;
    paramm = paramm.gcy;
    ab.i("FunctionMsg.FunctionMsgFetcher", "[onSceneEnd] size:%s errCode:%s errMsg:%s", new Object[] { Integer.valueOf(this.eAC.size()), Integer.valueOf(paramInt2), paramString });
    label165: boolean bool;
    if (this.eAC.contains(paramm))
    {
      if ((paramInt2 == 0) && ((paramInt2 != 0) || (localajc != null)) && ((localajc == null) || (localajc.OpCode != 2)) && ((localajc == null) || (localajc.OpCode != 1)))
        break label756;
      paramString = paramm.field_functionmsgid;
      long l1 = paramm.field_preVersion;
      long l2 = paramm.field_version;
      if (localajc != null)
        break label546;
      paramInt1 = -1;
      ab.i("FunctionMsg.FunctionMsgFetcher", "functionMsgId: %s, fetch failed, mark as fetch failed, preVersion: %s, version: %s op:%s", new Object[] { paramString, Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(paramInt1) });
      if (paramm.field_retryCount >= paramm.field_retryCountLimit)
        break label638;
      paramInt2 = paramm.field_retryCount;
      paramString = paramm.field_functionmsgid;
      paramInt1 = paramm.field_retryinterval;
      if (localajc != null)
        break label555;
      bool = true;
      label243: ab.i("FunctionMsg.FunctionMsgFetcher", "[handleFailureFetch] has retryCount:%s id:%s retryInterval:%s response is null?%s", new Object[] { Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramInt1), Boolean.valueOf(bool) });
      if (localajc == null)
        break label598;
      ab.i("FunctionMsg.FunctionMsgFetcher", "[handleFailureFetch] opCode:%s actionTime:%s", new Object[] { Integer.valueOf(localajc.OpCode), Integer.valueOf(localajc.wpa) });
      if (localajc.OpCode != 2)
        break label561;
      paramm.field_actionTime = localajc.wpa;
      paramm.field_retryCount += 1;
      paramm.field_status = -1;
      label358: paramm.cF(localajc.woW);
      label368: paramString = ba.xZa;
      ba.a(paramm.field_functionmsgid, paramm);
      if (paramm.field_status == 3)
        break label647;
      h.pYm.a(paramm.field_reportid, paramm.field_failkey, 1L, false);
      ab.i("FunctionMsg.FunctionMsgFetcher", "[handleFailureFetch] maybe has to retry fetch! delay:%sms retryCount:%s", new Object[] { Long.valueOf((paramm.field_actionTime - cb.aaD() / 1000L) * 1000L), Integer.valueOf(paramm.field_retryCount) });
      label457: if (((paramm.field_status != 2) && (paramm.field_status != -2)) || (!this.eAC.remove(paramm)))
        break label917;
      this.eAD.a(paramm);
      h.pYm.a(paramm.field_reportid, paramm.field_successkey, 1L, false);
    }
    while (true)
    {
      if (this.eAC.size() <= 0)
        release();
      AppMethodBeat.o(35452);
      break;
      label546: paramInt1 = localajc.OpCode;
      break label165;
      label555: bool = false;
      break label243;
      label561: if (localajc.OpCode == 1)
      {
        paramm.field_status = 3;
        paramm.field_retryCount = paramm.field_retryCountLimit;
        break label358;
      }
      paramm.field_status = 3;
      break label358;
      label598: paramm.field_status = -1;
      paramm.field_actionTime = (cb.aaD() / 1000L + paramm.field_retryinterval);
      paramm.field_retryCount += 1;
      break label368;
      label638: paramm.field_status = 3;
      break label368;
      label647: paramString = a(paramm.field_addMsg, paramm.field_defaultContent);
      ab.i("FunctionMsg.FunctionMsgFetcher", "[handleFailFetch] addMsgDefault is null? %s", new Object[] { paramString });
      paramm.a(paramString);
      if (paramString == null);
      for (paramInt1 = 3; ; paramInt1 = 2)
      {
        paramm.field_status = paramInt1;
        if (3 == paramm.field_status)
        {
          paramm.field_version = paramm.field_preVersion;
          h.pYm.a(paramm.field_reportid, paramm.field_finalfailkey, 1L, false);
        }
        paramString = ba.xZa;
        ba.a(paramm.field_functionmsgid, paramm);
        break;
      }
      label756: if ((localajc == null) || (paramInt2 != 0) || ((localajc.OpCode != 3) && (localajc.OpCode != 0)))
        break label457;
      ab.i("FunctionMsg.FunctionMsgFetcher", "functionMsgId: %s fetch success, response.version: %s, fetchItem.version: %s ActionTime:%s OpCode:%s", new Object[] { paramm.field_functionmsgid, Long.valueOf(localajc.woY), Long.valueOf(paramm.field_version), Integer.valueOf(localajc.wpa), Integer.valueOf(localajc.OpCode) });
      if (localajc.OpCode == 3);
      for (paramInt1 = -2; ; paramInt1 = 2)
      {
        paramm.field_status = paramInt1;
        paramm.a(localajc.woZ);
        paramm.field_businessInfo = localajc.woX;
        paramm.field_actionTime = localajc.wpa;
        paramString = ba.xZa;
        ba.a(paramm.field_functionmsgid, paramm);
        break;
      }
      label917: if (this.eAC.remove(paramm))
        this.eAD.b(paramm);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.u.b
 * JD-Core Version:    0.6.2
 */