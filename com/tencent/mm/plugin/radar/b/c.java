package com.tencent.mm.plugin.radar.b;

import a.l;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/model/RadarAddContact;", "Lcom/tencent/mm/sdk/storage/MStorageEx$IOnStorageChange;", "delegate", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$IOnAddContact;", "context", "Landroid/content/Context;", "(Lcom/tencent/mm/plugin/radar/model/RadarAddContact$IOnAddContact;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getDelegate", "()Lcom/tencent/mm/plugin/radar/model/RadarAddContact$IOnAddContact;", "handler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "msgListener", "com/tencent/mm/plugin/radar/model/RadarAddContact$msgListener$1", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$msgListener$1;", "needVerify", "Ljava/util/HashMap;", "", "onFMsgInfoNotify", "com/tencent/mm/plugin/radar/model/RadarAddContact$onFMsgInfoNotify$1", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$onFMsgInfoNotify$1;", "verifying", "Ljava/util/LinkedList;", "addContact", "", "username", "buildContact", "Lcom/tencent/mm/storage/Contact;", "verify", "Lcom/tencent/mm/storage/MsgInfo$VerifyContent;", "getStatus", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;", "getVerifyMsg", "", "onAddContactReturn", "ret", "hasSendVerify", "errMsg", "timeStamp", "onCreate", "", "onDestroy", "onNotifyChange", "event", "", "stg", "Lcom/tencent/mm/sdk/storage/MStorageEx;", "obj", "", "onRecvFriendAdded", "contact", "onRecvFriendVerify", "onVerifyContactReturn", "putVerifyMsg", "msgContent", "removeVerifyMsg", "removeVerifying", "reset", "updateFMsgConversationState", "state", "verifyContact", "AddContactHelper", "Companion", "IOnAddContact", "IOnAddContactHelper", "Status", "plugin-radar_release"})
public final class c
  implements n.b
{
  public static final String TAG = "MicroMsg.RadarAddContact";
  public static final c.b pAR;
  final Context context;
  private final ak handler;
  private final LinkedList<String> pAM;
  public final HashMap<String, String> pAN;
  public final c.i pAO;
  public final c.g pAP;
  final c.c pAQ;

  static
  {
    AppMethodBeat.i(102891);
    pAR = new c.b((byte)0);
    TAG = "MicroMsg.RadarAddContact";
    AppMethodBeat.o(102891);
  }

  public c(c.c paramc, Context paramContext)
  {
    AppMethodBeat.i(102890);
    this.pAQ = paramc;
    this.context = paramContext;
    this.pAM = new LinkedList();
    this.pAN = new HashMap();
    this.pAO = new c.i(this);
    this.pAP = new c.g(this);
    this.handler = new ak();
    AppMethodBeat.o(102890);
  }

  private final void O(ad paramad)
  {
    AppMethodBeat.i(102886);
    if (this.pAM.contains(paramad.getUsername()))
      this.pAM.remove(paramad.getUsername());
    if (this.pAM.contains(paramad.Hv()))
      this.pAM.remove(paramad.Hv());
    AppMethodBeat.o(102886);
  }

  private final void P(ad paramad)
  {
    AppMethodBeat.i(102887);
    this.pAN.remove(paramad.getUsername());
    this.pAN.remove(paramad.Hv());
    AppMethodBeat.o(102887);
  }

  private final void Q(ad paramad)
  {
    AppMethodBeat.i(102889);
    O(paramad);
    P(paramad);
    this.handler.post((Runnable)new c.j(this, paramad));
    AppMethodBeat.o(102889);
  }

  public final long Vw(String paramString)
  {
    AppMethodBeat.i(102884);
    a.f.b.j.p(paramString, "username");
    long l = System.currentTimeMillis();
    c.a locala = new c.a(this, (c.d)new c.f(this, paramString, l));
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(Integer.valueOf(48));
    if ((paramString != null) && (paramString.length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      Assert.assertTrue(true);
      locala.onStart();
      locala.pAT = localLinkedList;
      locala.igi = paramString;
      if (paramString != null)
        locala.pAS.add(paramString);
      g.Rg().d((com.tencent.mm.ai.m)new com.tencent.mm.pluginsdk.model.m(2, (List)locala.pAS, (List)localLinkedList, "", ""));
      AppMethodBeat.o(102884);
      return l;
    }
  }

  public final c.e Vx(String paramString)
  {
    AppMethodBeat.i(102885);
    a.f.b.j.p(paramString, "username");
    Object localObject = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(localObject, "service(IMessengerStorage::class.java)");
    localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject).XM().aoO(paramString);
    if ((localObject == null) || (((ad)localObject).Oh() == 0))
      if (this.pAM.contains(paramString))
        localObject = c.e.pAX;
    while (true)
    {
      ab.d(TAG, "query username(%s) status %s", new Object[] { paramString, localObject });
      AppMethodBeat.o(102885);
      return localObject;
      localObject = c.e.pAW;
      continue;
      if (((ad)localObject).NX())
        localObject = c.e.pAY;
      else if (this.pAN.containsKey(paramString))
        localObject = c.e.pAZ;
      else if (this.pAM.contains(paramString))
        localObject = c.e.pAX;
      else
        localObject = c.e.pAW;
    }
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(102888);
    a.f.b.j.p(paramn, "stg");
    ab.d(TAG, "onNotifyChange event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.e(TAG, "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(102888);
    }
    while (true)
    {
      return;
      paramn = (String)paramObject;
      paramObject = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(paramObject, "service(IMessengerStorage::class.java)");
      paramObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)paramObject).XM().aoO(paramn);
      if ((paramObject != null) && (paramObject.NX()))
      {
        ab.d(TAG, "ContactStg onNotifyChange %s", new Object[] { paramn });
        Q(paramObject);
      }
      AppMethodBeat.o(102888);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.c
 * JD-Core Version:    0.6.2
 */