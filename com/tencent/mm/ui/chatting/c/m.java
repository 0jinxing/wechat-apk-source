package com.tencent.mm.ui.chatting.c;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.ae;
import com.tencent.mm.ui.chatting.c.b.d;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.chatting.c.b.t;
import com.tencent.mm.ui.chatting.c.b.v;
import com.tencent.mm.ui.widget.MMEditText;

@com.tencent.mm.ui.chatting.c.a.a(dFp=ae.class)
public class m extends a
  implements ae
{
  private boolean yPq = false;
  private boolean yPr = false;
  private String yPs;
  private String yPt;
  private m.a yPu = m.a.yPv;

  private void dDT()
  {
    AppMethodBeat.i(31384);
    o localo = (o)this.cgL.aF(o.class);
    if (localo.dDX() == null)
    {
      AppMethodBeat.o(31384);
      return;
    }
    if (this.yPu == m.a.yPw);
    for (boolean bool = true; ; bool = false)
    {
      localo.dDX().oQ(bool);
      AppMethodBeat.o(31384);
      break;
    }
  }

  private void dDU()
  {
    AppMethodBeat.i(31385);
    o localo = (o)this.cgL.aF(o.class);
    if (localo.dDX() == null)
      AppMethodBeat.o(31385);
    while (true)
    {
      return;
      localo.dDX().dkz();
      AppMethodBeat.o(31385);
    }
  }

  public final void dDS()
  {
    AppMethodBeat.i(31383);
    if (bo.isNullOrNil(this.cgL.getTalkerUserName()))
      AppMethodBeat.o(31383);
    while (true)
    {
      return;
      o localo = (o)this.cgL.aF(o.class);
      if ((!bo.isNullOrNil(this.yPs)) && (localo.dDX() != null))
      {
        int i;
        label85: boolean bool1;
        if ((localo.dDX().getMode() == 1) && (bo.isNullOrNil(localo.dEa())))
        {
          i = 1;
          bool1 = ((com.tencent.mm.ui.chatting.c.b.z)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.z.class)).dEU();
          if ((i == 0) || (bool1))
            break label346;
          dDU();
          label115: boolean bool2 = ((d)this.cgL.aF(d.class)).dDn();
          if (((!this.cgL.dFw()) && (!bool2)) || (!this.yPq))
            break label353;
          this.yPq = false;
          String str1 = localo.dDX().getAtSomebody();
          if (!bo.isNullOrNil(str1))
          {
            int j = localo.dDX().getInsertPos();
            i = j;
            if (j > this.yPs.length())
              i = this.yPs.length();
            StringBuilder localStringBuilder = new StringBuilder().append(this.yPs.substring(0, i)).append(str1).append(' ');
            String str2 = this.yPs;
            str2 = str2.substring(i, str2.length());
            j = str1.length();
            localo.dDX().setLastContent(str2);
            localo.dDX().u(str2, i + j + 1, false);
            localo.dDX().setAtSomebody(null);
            this.cgL.showVKB();
          }
        }
        while (true)
        {
          localo.dEd();
          AppMethodBeat.o(31383);
          break;
          i = 0;
          break label85;
          label346: dDT();
          break label115;
          label353: localo.dDX().setLastContent(this.yPs);
          localo.dDX().setLastText(this.yPs);
          if ((!bo.isNullOrNil(this.yPs)) && (!bool1) && (bo.isNullOrNil(localo.dEa())))
            localo.dEh();
        }
      }
      if (localo.dDX() != null)
      {
        if (((t)this.cgL.aF(t.class)).dEF())
        {
          localo.dDX().setLastText(this.yPs);
          localo.dDX().setHint(this.cgL.yTx.getMMResources().getString(2131298261));
          AppMethodBeat.o(31383);
        }
        else if (localo.dDX().getIsVoiceInputPanleShow())
        {
          localo.dEd();
          AppMethodBeat.o(31383);
        }
        else
        {
          dDT();
        }
      }
      else
        AppMethodBeat.o(31383);
    }
  }

  public final void dxA()
  {
  }

  public final void dxB()
  {
    AppMethodBeat.i(31382);
    Object localObject = (o)this.cgL.aF(o.class);
    o localo;
    if (((o)localObject).dDX() != null)
    {
      if (((o)localObject).dDX().dkD())
      {
        this.yPu = m.a.yPw;
        ab.d("MicroMsg.ChattingUI.SearchComponent", "jacks mark refreshKeyBordState keybord state: show");
        this.yPs = ((o)localObject).dDX().getLastText();
      }
    }
    else
    {
      localo = (o)this.cgL.aF(o.class);
      localObject = (d)this.cgL.aF(d.class);
      if (!((d)localObject).dDm())
        break label250;
      localObject = com.tencent.mm.aj.z.aeU().fv(((d)localObject).dDz());
      if ((localo.dDX() != null) && ((this.yPt == null) || (!localo.dDX().getLastText().trim().equals(this.yPt))))
      {
        this.yPt = localo.dDX().getLastText().trim();
        ((com.tencent.mm.aj.a.a)localObject).field_editingMsg = this.yPt;
        if (!bo.isNullOrNil(((com.tencent.mm.aj.a.a)localObject).field_editingMsg))
          break label243;
      }
    }
    label243: for (long l = ((com.tencent.mm.aj.a.a)localObject).field_lastMsgTime; ; l = System.currentTimeMillis())
    {
      ((com.tencent.mm.aj.a.a)localObject).field_flag = b.a((com.tencent.mm.aj.a.a)localObject, 1, l);
      com.tencent.mm.aj.z.aeU().b((com.tencent.mm.aj.a.a)localObject);
      ab.v("MicroMsg.ChattingUI.SearchComponent", "set editMsg history");
      AppMethodBeat.o(31382);
      return;
      this.yPu = m.a.yPv;
      ab.d("MicroMsg.ChattingUI.SearchComponent", "jacks mark refreshKeyBordState keybord state: hide");
      break;
    }
    label250: localObject = null;
    if (g.RN().QY())
    {
      aw.ZK();
      localObject = c.XR().aoZ(this.cgL.getTalkerUserName());
    }
    if ((localObject == null) && (localo.dDX() != null) && (!bo.isNullOrNil(localo.dDX().getLastText().trim())))
    {
      localObject = new ak(this.cgL.sRl.field_username);
      ((ak)localObject).eD(System.currentTimeMillis());
      if (((v)this.cgL.aF(v.class)).dEL())
        ((ak)localObject).jj(4194304);
      aw.ZK();
      c.XR().d((ak)localObject);
    }
    while (true)
    {
      if ((localObject != null) && (localo.dDX() != null) && ((this.yPt == null) || (!localo.dDX().getLastText().trim().equals(this.yPt))))
      {
        this.yPt = localo.dDX().getLastText().trim();
        ((ak)localObject).jk(localo.dDX().getLastText().trim());
        if (!bo.isNullOrNil(((at)localObject).field_editingMsg))
          break label538;
      }
      label538: for (l = ((at)localObject).field_conversationTime; ; l = System.currentTimeMillis())
      {
        ((ak)localObject).eE(com.tencent.mm.plugin.messenger.foundation.a.a.a.a((ak)localObject, 1, l));
        aw.ZK();
        c.XR().a((ak)localObject, ((at)localObject).field_username, false);
        ab.i("MicroMsg.ChattingUI.SearchComponent", "[doDestroy] set editMsg history! content:%s username:%s", new Object[] { bo.anv(this.yPt), this.cgL.getTalkerUserName() });
        AppMethodBeat.o(31382);
        break;
      }
    }
  }

  public final void dxC()
  {
  }

  public final void dxy()
  {
    AppMethodBeat.i(31381);
    ab.d("MicroMsg.ChattingUI.SearchComponent", "jacks mark reset keybord state");
    this.yPu = m.a.yPv;
    Object localObject;
    if (this.cgL.sRl != null)
    {
      localObject = (d)this.cgL.aF(d.class);
      if (((d)localObject).dDm())
      {
        localObject = com.tencent.mm.aj.z.aeU().fv(((d)localObject).dDz()).field_editingMsg;
        this.yPs = ((String)localObject);
        this.yPt = ((String)localObject);
        AppMethodBeat.o(31381);
      }
    }
    while (true)
    {
      return;
      aw.ZK();
      localObject = c.XR().aoZ(this.cgL.getTalkerUserName());
      if (localObject != null)
      {
        localObject = ((at)localObject).field_editingMsg;
        this.yPs = ((String)localObject);
        this.yPt = ((String)localObject);
      }
      AppMethodBeat.o(31381);
    }
  }

  public final void dxz()
  {
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(31378);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
    case 212:
    }
    while (true)
    {
      AppMethodBeat.o(31378);
      o localo;
      String str;
      while (true)
      {
        return;
        if (paramIntent == null)
          break;
        localo = (o)this.cgL.aF(o.class);
        str = paramIntent.getStringExtra("select_raw_user_name");
        paramIntent = paramIntent.getStringExtra("Select_Conv_User");
        if (!bo.isNullOrNil(paramIntent))
          break label126;
        ab.d("MicroMsg.ChattingUI.SearchComponent", "@ %s", new Object[] { "[nobody]" });
        localo.dDX().setAtSomebody("");
        this.yPq = false;
        AppMethodBeat.o(31378);
      }
      continue;
      label126: ab.d("MicroMsg.ChattingUI.SearchComponent", "@ %s", new Object[] { paramIntent });
      localo.dDX().setAtSomebody(paramIntent);
      localo.dDX().ax(this.cgL.getTalkerUserName(), str, paramIntent);
      this.yPq = true;
    }
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(31380);
    this.yPs = ((o)this.cgL.aF(o.class)).dDX().getLastText();
    dDS();
    AppMethodBeat.o(31380);
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(31379);
    Object localObject;
    int i;
    if (paramKeyEvent.getKeyCode() == 67)
    {
      localObject = (o)this.cgL.aF(o.class);
      if (paramKeyEvent.getAction() == 0)
      {
        if (((o)localObject).dDX().getCharAtCursor() != ' ')
          break label127;
        this.yPr = true;
      }
      if ((paramKeyEvent.getAction() == 1) && (this.yPr))
      {
        this.yPr = false;
        paramKeyEvent = ((o)localObject).dDX();
        paramInt = paramKeyEvent.getSelectionStart();
        localObject = paramKeyEvent.getLastText().substring(0, paramInt);
        i = ((String)localObject).lastIndexOf('@');
        if ((i < ((String)localObject).length()) && (i >= 0))
          break label135;
      }
    }
    while (true)
    {
      AppMethodBeat.o(31379);
      return false;
      label127: this.yPr = false;
      break;
      label135: localObject = ((String)localObject).substring(0, i);
      String str = paramKeyEvent.getLastText().substring(paramInt);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append((String)localObject).append(str);
      paramKeyEvent.setLastText(localStringBuilder.toString());
      paramKeyEvent.oij.setSelection(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.m
 * JD-Core Version:    0.6.2
 */