package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.gdpr.b;
import com.tencent.mm.plugin.webview.model.ag;
import com.tencent.mm.protocal.protobuf.bew;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class SDKOAuthOtherUI$4
  implements b
{
  SDKOAuthOtherUI$4(SDKOAuthOtherUI paramSDKOAuthOtherUI, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void kL(int paramInt)
  {
    AppMethodBeat.i(7509);
    ab.i("MicroMsg.SDKOAuthOtherUI", " MPGdprPolicyUtil.checkPolicy onPermissionReturn:%d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 1)
    {
      SDKOAuthOtherUI.d(this.usw).IH(-4);
      AppMethodBeat.o(7509);
    }
    while (true)
    {
      return;
      LinkedList localLinkedList;
      if (this.usz == 7)
      {
        SDKOAuthOtherUI.a locala = SDKOAuthOtherUI.e(this.usw);
        localLinkedList = new LinkedList();
        for (paramInt = 0; paramInt < locala.usA.size(); paramInt++)
        {
          bew localbew = (bew)locala.usA.get(paramInt);
          if ((localbew.wIR == 2) || (localbew.wIR == 3))
            localLinkedList.add(localbew.scope);
        }
      }
      while (true)
        if ((this.ust != -2) && (this.usu != -2))
        {
          if ((this.ust == 8) && (this.usu == 8) && (this.usz == 8))
          {
            SDKOAuthOtherUI.d(this.usw).IH(-4);
            AppMethodBeat.o(7509);
            break;
            localLinkedList = new LinkedList();
            continue;
          }
          if (this.usu == 7)
            localLinkedList.add("snsapi_friend");
          if (this.ust == 7)
          {
            SDKOAuthOtherUI.d(this.usw);
            ag.a(SDKOAuthOtherUI.f(this.usw), localLinkedList);
            if (SDKOAuthOtherUI.g(this.usw) == -1)
              ab.e("MicroMsg.SDKOAuthOtherUI", "btnCallback: do not get avatarId from pageone");
            if (SDKOAuthOtherUI.h(this.usw))
            {
              SDKOAuthOtherUI.d(this.usw);
              ag.a(localLinkedList, SDKOAuthOtherUI.g(this.usw), SDKOAuthOtherUI.i(this.usw));
              AppMethodBeat.o(7509);
              break;
            }
            SDKOAuthOtherUI.d(this.usw).h(localLinkedList, SDKOAuthOtherUI.g(this.usw));
            AppMethodBeat.o(7509);
            break;
          }
          if (SDKOAuthOtherUI.h(this.usw))
          {
            SDKOAuthOtherUI.d(this.usw);
            ag.a(localLinkedList, 0, SDKOAuthOtherUI.i(this.usw));
            AppMethodBeat.o(7509);
            break;
          }
          SDKOAuthOtherUI.d(this.usw).aB(localLinkedList);
          AppMethodBeat.o(7509);
          break;
        }
      if (this.ust != -2)
      {
        if ((this.ust == 8) && (this.usz == 8))
        {
          SDKOAuthOtherUI.d(this.usw).IH(-4);
          AppMethodBeat.o(7509);
        }
        else if (this.ust == 7)
        {
          SDKOAuthOtherUI.d(this.usw);
          ag.a(SDKOAuthOtherUI.f(this.usw), localLinkedList);
          if (SDKOAuthOtherUI.g(this.usw) == -1)
            ab.e("MicroMsg.SDKOAuthOtherUI", "btnCallback: do not get avatarId from pageone");
          if (SDKOAuthOtherUI.h(this.usw))
          {
            SDKOAuthOtherUI.d(this.usw);
            ag.a(localLinkedList, SDKOAuthOtherUI.g(this.usw), SDKOAuthOtherUI.i(this.usw));
            AppMethodBeat.o(7509);
          }
          else
          {
            SDKOAuthOtherUI.d(this.usw).h(localLinkedList, SDKOAuthOtherUI.g(this.usw));
            AppMethodBeat.o(7509);
          }
        }
        else if (SDKOAuthOtherUI.h(this.usw))
        {
          SDKOAuthOtherUI.d(this.usw);
          ag.a(localLinkedList, SDKOAuthOtherUI.g(this.usw), SDKOAuthOtherUI.i(this.usw));
          AppMethodBeat.o(7509);
        }
        else
        {
          SDKOAuthOtherUI.d(this.usw).aB(localLinkedList);
          AppMethodBeat.o(7509);
        }
      }
      else if (this.usu != -2)
      {
        if ((this.usu == 8) && (this.usz == 8))
        {
          SDKOAuthOtherUI.d(this.usw).IH(-4);
          AppMethodBeat.o(7509);
        }
        else
        {
          if (this.usu == 7)
            localLinkedList.add("snsapi_friend");
          SDKOAuthOtherUI.d(this.usw).aB(localLinkedList);
          AppMethodBeat.o(7509);
        }
      }
      else if (this.usz == 8)
      {
        SDKOAuthOtherUI.d(this.usw).IH(-4);
        AppMethodBeat.o(7509);
      }
      else
      {
        SDKOAuthOtherUI.d(this.usw).aB(localLinkedList);
        AppMethodBeat.o(7509);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI.4
 * JD-Core Version:    0.6.2
 */