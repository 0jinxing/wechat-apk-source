package com.tencent.wecall.talkroom.model;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.b.a.a.am;
import com.tencent.pb.common.c.d;
import com.tencent.pb.common.c.g;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import java.util.List;

final class e$1
  implements g.a
{
  e$1(e parame)
  {
  }

  public final void H(String paramString, byte[] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(127835);
    if (paramArrayOfByte == null);
    while (true)
    {
      com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "onRcvMultiTalkMsg groupId: ", paramString, " datas size: ", Integer.valueOf(i) });
      if (e.a(this.AJh) != null)
        e.a(this.AJh);
      AppMethodBeat.o(127835);
      return;
      i = paramArrayOfByte.length;
    }
  }

  public final void Sm(int paramInt)
  {
    AppMethodBeat.i(127820);
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onOpeningChannel", Integer.valueOf(paramInt) });
    AppMethodBeat.o(127820);
  }

  public final void Sn(int paramInt)
  {
    AppMethodBeat.i(127836);
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onSwitchMultiTalkVideoSuss bitRate: ", Integer.valueOf(paramInt) });
    if (e.a(this.AJh) != null)
      e.a(this.AJh).bRM();
    AppMethodBeat.o(127836);
  }

  public final void a(int paramInt, MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(127832);
    com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "onMisscMultiTalk", paramMultiTalkGroup, " time: ", Integer.valueOf(paramInt) });
    if (e.a(this.AJh) != null)
    {
      e.a(this.AJh).d(paramMultiTalkGroup);
      if (com.tencent.pb.common.a.a.Alq)
        Toast.makeText(d.sZj, "onMisscMultiTalk ".concat(String.valueOf(paramMultiTalkGroup)), 0).show();
    }
    AppMethodBeat.o(127832);
  }

  public final void akC()
  {
    AppMethodBeat.i(127821);
    com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "onInitSeccess" });
    if (com.tencent.pb.common.a.a.Alq)
      Toast.makeText(d.sZj, "onInitSeccess ", 0).show();
    if (e.a(this.AJh) != null)
      e.a(this.AJh).bRL();
    AppMethodBeat.o(127821);
  }

  public final void b(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(127831);
    com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "onInviteMultiTalk", paramMultiTalkGroup });
    if (e.a(this.AJh) != null)
    {
      e.a(this.AJh).b(paramMultiTalkGroup);
      if (com.tencent.pb.common.a.a.Alq)
        Toast.makeText(d.sZj, "onInviteMultiTalk ".concat(String.valueOf(paramMultiTalkGroup)), 0).show();
    }
    AppMethodBeat.o(127831);
  }

  public final void bRN()
  {
    AppMethodBeat.i(127837);
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onSubscribeLargeVideoSuss" });
    if (e.a(this.AJh) != null)
      e.a(this.AJh).bRN();
    AppMethodBeat.o(127837);
  }

  public final void cq(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(127825);
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onExitRoom", paramString, a.dSR().neq, Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(127825);
  }

  public final void cr(List<a.am> paramList)
  {
    AppMethodBeat.i(127838);
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onVideoGroupMemberChange videoUserNames: ", paramList });
    if (e.a(this.AJh) != null)
      e.a(this.AJh).cr(paramList);
    AppMethodBeat.o(127838);
  }

  public final void dTm()
  {
    AppMethodBeat.i(127827);
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onSelfHoldOnBegin" });
    AppMethodBeat.o(127827);
  }

  public final void dTn()
  {
    AppMethodBeat.i(127828);
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onSelfHoldOnEnd" });
    AppMethodBeat.o(127828);
  }

  public final void dTo()
  {
    AppMethodBeat.i(127834);
    com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "onSendMsgSucc" });
    if (e.a(this.AJh) != null)
      e.a(this.AJh);
    AppMethodBeat.o(127834);
  }

  public final void eS(String paramString, int paramInt)
  {
    AppMethodBeat.i(127829);
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onModifyGroupInfo", paramString, Integer.valueOf(paramInt) });
    AppMethodBeat.o(127829);
  }

  public final void fF(List<MultiTalkGroup> paramList)
  {
    AppMethodBeat.i(127833);
    com.tencent.pb.common.c.c.i("TalkRoomSdkApi", new Object[] { "onActiveMultiTalkList ", paramList });
    if (e.a(this.AJh) != null)
      e.a(this.AJh);
    AppMethodBeat.o(127833);
  }

  public final void g(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(127822);
    Object localObject = a.dSR().neq;
    String str = null;
    if (paramMultiTalkGroup != null)
      str = paramMultiTalkGroup.Aqc;
    com.tencent.pb.common.c.c.i("TalkRoomSdkApi", new Object[] { "onMemberChange mGroupId: ", localObject, " groupId: ", str, paramMultiTalkGroup });
    if (com.tencent.pb.common.a.a.Alq)
      Toast.makeText(d.sZj, "onMemberChange ".concat(String.valueOf(paramMultiTalkGroup)), 0).show();
    int i;
    int j;
    int k;
    if (g.iA(str, (String)localObject))
    {
      c.dTg();
      if ((c.auJ((String)localObject)) && (a.dSR().state != 3))
      {
        c.dTg();
        i = c.auK((String)localObject);
        if (i != 104)
          break label270;
        j = -1602;
        k = 325;
      }
    }
    while (true)
    {
      com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "onMemberChange isMySelfExit finish ", "stopstatus", Integer.valueOf(j), Integer.valueOf(k), str, " reason: ", Integer.valueOf(i) });
      h.Sq(j);
      a.dSR().AJC.Su(k);
      localObject = a.dSR();
      k = a.dSR().nCF;
      long l = a.dSR().sZg;
      a.dSR();
      ((f)localObject).a(str, k, l, false, false, false);
      if (e.a(this.AJh) != null)
        e.a(this.AJh).g(paramMultiTalkGroup);
      AppMethodBeat.o(127822);
      return;
      label270: if (i == 2)
      {
        j = -1603;
        k = 326;
      }
      else
      {
        j = -1604;
        k = 328;
      }
    }
  }

  public final void jg(boolean paramBoolean)
  {
    AppMethodBeat.i(127830);
    com.tencent.pb.common.c.c.i("TalkRoomSdkApi", new Object[] { "onMuteStateChange", Boolean.valueOf(paramBoolean) });
    if (e.a(this.AJh) != null)
      e.a(this.AJh).jg(paramBoolean);
    AppMethodBeat.o(127830);
  }

  public final void k(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(127823);
    com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "onErr errCode: ", Integer.valueOf(paramInt), " data: ", paramObject });
    if (e.a(this.AJh) != null)
      e.a(this.AJh).k(paramInt, paramObject);
    AppMethodBeat.o(127823);
  }

  public final void onStateChanged(int paramInt)
  {
    AppMethodBeat.i(127826);
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onStateChanged", Integer.valueOf(paramInt) });
    AppMethodBeat.o(127826);
  }

  public final void p(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(127819);
    com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "onCreateRoom", paramMultiTalkGroup });
    if (com.tencent.pb.common.a.a.Alq)
      Toast.makeText(d.sZj, "onCreateRoom ".concat(String.valueOf(paramMultiTalkGroup)), 0).show();
    if (e.a(this.AJh) != null)
      e.a(this.AJh).e(paramMultiTalkGroup);
    AppMethodBeat.o(127819);
  }

  public final void q(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(127824);
    com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "onEnterRoom", paramMultiTalkGroup });
    if (e.a(this.AJh) != null)
    {
      e.a(this.AJh).f(paramMultiTalkGroup);
      if (com.tencent.pb.common.a.a.Alq)
        Toast.makeText(d.sZj, "onEnterRoom ".concat(String.valueOf(paramMultiTalkGroup)), 0).show();
    }
    AppMethodBeat.o(127824);
  }

  public final void ze(int paramInt)
  {
    AppMethodBeat.i(127839);
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onNotifyLargeVideoSubscribersChange largeVideoSubscribersCnt: ", Integer.valueOf(paramInt) });
    if (e.a(this.AJh) != null)
      e.a(this.AJh).ze(paramInt);
    AppMethodBeat.o(127839);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.e.1
 * JD-Core Version:    0.6.2
 */