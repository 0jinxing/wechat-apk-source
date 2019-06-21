package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bre;
import com.tencent.mm.sdk.platformtools.bo;

final class AllRemindMsgUI$d
{
  int cuu;
  int cvp;
  long cvx;
  String nickname;
  long timestamp;
  String title;
  String username;
  String whS;
  bre yeE;
  String yeF;

  AllRemindMsgUI$d(AllRemindMsgUI paramAllRemindMsgUI)
  {
  }

  public final String toString()
  {
    AppMethodBeat.i(29128);
    String str = "RemindItem{username='" + this.username + '\'' + ", nickname='" + this.nickname + '\'' + ", title='" + bo.anv(this.title) + '\'' + ", timestamp=" + this.timestamp + ", subType=" + this.cuu + ", msgId=" + this.cvx + ", sourceType=" + this.cvp + ", sourceId='" + this.whS + '\'' + '}';
    AppMethodBeat.o(29128);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AllRemindMsgUI.d
 * JD-Core Version:    0.6.2
 */