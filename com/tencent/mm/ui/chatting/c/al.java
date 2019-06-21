package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.magicbrush.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.aj;
import com.tencent.mm.g.b.a.am;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.story.api.k;
import com.tencent.mm.plugin.story.api.k.a;
import com.tencent.mm.plugin.story.api.n;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.plugin.story.g.i;
import com.tencent.mm.plugin.story.g.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.j;
import com.tencent.mm.ui.chatting.view.AvatarImageView;
import com.tencent.mm.ui.chatting.viewitems.ay;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@com.tencent.mm.ui.chatting.c.a.a(dFp=x.class)
public class al extends a
  implements k.a, x
{
  private String cvF;
  private long iBO;
  private boolean mgQ;
  private boolean mlA;
  private boolean pls;
  private boolean rXd;
  private List<String> sbP;
  private long smo;
  private k ySl;
  private List<String> ySm;
  private boolean ySn;
  private boolean ySo;
  private SparseArray<WeakReference<AvatarImageView>> ySp;
  private MenuItem.OnMenuItemClickListener yvX;

  public al()
  {
    AppMethodBeat.i(31723);
    this.ySm = Collections.synchronizedList(new ArrayList());
    this.sbP = Collections.synchronizedList(new ArrayList());
    this.ySn = false;
    this.mgQ = true;
    this.pls = false;
    this.rXd = false;
    this.smo = 500L;
    this.iBO = 0L;
    this.cvF = null;
    this.mlA = false;
    this.ySo = false;
    this.ySp = new SparseArray();
    this.yvX = new al.1(this);
    AppMethodBeat.o(31723);
  }

  private void a(int paramInt1, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt2)
  {
    AppMethodBeat.i(31733);
    if (this.cgL.yTx.findMenuInfo(3) == null)
    {
      this.cgL.yTx.addIconOptionMenu(3, paramInt1, paramOnMenuItemClickListener, paramInt2);
      AppMethodBeat.o(31733);
    }
    while (true)
    {
      return;
      this.cgL.yTx.updateOptionMenu(3, paramInt1, paramOnMenuItemClickListener, paramInt2);
      AppMethodBeat.o(31733);
    }
  }

  private void dEY()
  {
    AppMethodBeat.i(31730);
    if (this.ySl != null)
    {
      this.ySl.destroy();
      this.ySl.a(null);
      this.ySl = null;
    }
    this.pls = false;
    this.rXd = false;
    this.ySm.clear();
    this.ySp.clear();
    AppMethodBeat.o(31730);
  }

  private void dEZ()
  {
    AppMethodBeat.i(31738);
    Object localObject;
    if ((this.pls) && (this.mlA))
    {
      this.mlA = false;
      localObject = h.scu;
      localObject = h.cAy();
      if (!this.rXd)
        break label61;
    }
    label61: for (long l = 1L; ; l = 0L)
    {
      ((aj)localObject).cYR = l;
      localObject = h.scu;
      h.cAz();
      AppMethodBeat.o(31738);
      return;
    }
  }

  public final void L(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(31736);
    j localj = (j)this.cgL.aF(j.class);
    int i;
    if (paramBoolean2)
    {
      i = 1;
      localj.Oz(i);
      if ((this.pls != paramBoolean1) || (this.rXd != paramBoolean2))
        break label73;
      AppMethodBeat.o(31736);
    }
    while (true)
    {
      return;
      if (paramBoolean1)
      {
        i = 2;
        break;
      }
      i = 0;
      break;
      label73: ab.i("MicroMsg.StoryStateComponent", "updateChatRoomState: hasStory %s, hasUnread %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
      this.pls = paramBoolean1;
      this.rXd = paramBoolean2;
      com.tencent.mm.sdk.platformtools.al.d(new al.2(this));
      dEZ();
      AppMethodBeat.o(31736);
    }
  }

  public final void a(AvatarImageView paramAvatarImageView)
  {
    AppMethodBeat.i(31731);
    Object localObject = paramAvatarImageView.getTag();
    if ((localObject instanceof ay))
    {
      paramAvatarImageView.dk(((ay)localObject).userName, 5);
      localObject = ((ay)localObject).userName;
      if ((n.isShowStoryCheck()) && (this.ySl != null))
        break label84;
    }
    label84: for (boolean bool = false; ; bool = this.ySl.ZW((String)localObject))
    {
      paramAvatarImageView.setShowStoryHint(bool);
      this.ySp.put(paramAvatarImageView.hashCode(), new WeakReference(paramAvatarImageView));
      AppMethodBeat.o(31731);
      return;
    }
  }

  public final void a(List<String> paramList, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(31735);
    ab.i("MicroMsg.StoryStateComponent", "updateGalleryUserList: size is %s %s hashCode:%s", new Object[] { this.cgL.sRl, Integer.valueOf(paramList.size()), Integer.valueOf(hashCode()) });
    this.ySm.clear();
    this.ySm.addAll(paramList);
    this.sbP.clear();
    this.sbP.addAll(paramArrayList);
    AppMethodBeat.o(31735);
  }

  public final boolean arn(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(31734);
    if (System.currentTimeMillis() - this.iBO <= this.smo)
    {
      ab.i("MicroMsg.StoryStateComponent", "onclick pass $clickTime now: %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      AppMethodBeat.o(31734);
      return bool;
    }
    this.iBO = System.currentTimeMillis();
    ArrayList localArrayList = new ArrayList(this.ySm);
    bool = localArrayList.remove(paramString);
    if (bool)
    {
      ab.i("MicroMsg.StoryStateComponent", "goToStoryGalleryWithUser click go %s", new Object[] { paramString });
      n.bj(2, paramString);
      n.enterGallery(this.sbP);
      n.ZX(paramString);
      if (!this.mgQ)
        break label165;
      localArrayList.add(0, paramString);
      n.a(this.cgL.yTx.getContext(), localArrayList, this.cgL.getTalkerUserName(), this.cvF);
    }
    while (true)
    {
      AppMethodBeat.o(31734);
      break;
      label165: n.aT(this.cgL.yTx.getContext(), paramString);
    }
  }

  public final void bs(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(31737);
    ab.i("MicroMsg.StoryStateComponent", "notifyAvatar: ");
    com.tencent.mm.sdk.platformtools.al.d(new al.3(this, paramString, paramBoolean));
    AppMethodBeat.o(31737);
  }

  public final void dDh()
  {
    AppMethodBeat.i(31729);
    super.dDh();
    ab.i("MicroMsg.StoryStateComponent", "onComponentUnInstall: hashCode:%s", new Object[] { Integer.valueOf(hashCode()) });
    dEY();
    AppMethodBeat.o(31729);
  }

  public final void dEE()
  {
    AppMethodBeat.i(31732);
    int i = com.tencent.mm.m.g.Nu().getInt("StoryShouldShowEntraceInChatRoom", 1);
    if ((!this.pls) || (i == 0))
    {
      ab.i("MicroMsg.StoryStateComponent", "updateMenuItem enable %s", new Object[] { Integer.valueOf(i) });
      this.cgL.yTx.removeOptionMenu(3);
      AppMethodBeat.o(31732);
    }
    while (true)
    {
      return;
      if ((this.ySn) && (n.isShowStoryCheck()))
      {
        ab.i("MicroMsg.StoryStateComponent", "updateMenuItem: hasUnread %s hashCode:%s", new Object[] { Boolean.valueOf(this.rXd), Integer.valueOf(hashCode()) });
        if (this.rXd)
        {
          this.cgL.yTx.removeOptionMenu(3);
          a(2131231477, this.yvX, this.cgL.yTx.getContext().getResources().getColor(2131689505));
          AppMethodBeat.o(31732);
        }
        else
        {
          a(2131231478, this.yvX, 0);
        }
      }
      else
      {
        AppMethodBeat.o(31732);
      }
    }
  }

  public final void dxA()
  {
    long l1 = 2L;
    AppMethodBeat.i(31726);
    super.dxA();
    ab.i("MicroMsg.StoryStateComponent", "onChattingResume: hashCode:%s", new Object[] { Integer.valueOf(hashCode()) });
    this.mlA = true;
    dEZ();
    Object localObject1;
    Object localObject2;
    if (this.ySl != null)
    {
      this.ySl.resume();
      localObject1 = h.scu;
      localObject1 = h.cAs();
      if (this.mgQ)
      {
        l2 = 10L;
        ((ar)localObject1).cYQ = l2;
        localObject1 = h.scu;
        h.cAs().fA(this.cgL.getTalkerUserName());
        localObject1 = h.scu;
        localObject2 = h.cAs();
        if (!this.mgQ)
          break label192;
        l2 = 2L;
        label126: ((ar)localObject2).cZr = l2;
      }
    }
    else
    {
      localObject1 = h.scu;
      h.cAA().fs(this.cgL.getTalkerUserName());
      localObject1 = h.scu;
      localObject2 = h.cAA();
      if (!this.mgQ)
        break label212;
    }
    for (long l2 = l1; ; l2 = i.a.aaR(this.cgL.getTalkerUserName()))
    {
      ((am)localObject2).cZr = l2;
      AppMethodBeat.o(31726);
      return;
      l2 = 11L;
      break;
      label192: localObject1 = i.scv;
      l2 = i.a.aaR(this.cgL.getTalkerUserName());
      break label126;
      label212: localObject1 = i.scv;
    }
  }

  public final void dxB()
  {
    AppMethodBeat.i(31727);
    super.dxB();
    this.mlA = false;
    ab.i("MicroMsg.StoryStateComponent", "onChattingPause: hashCode:%s", new Object[] { Integer.valueOf(hashCode()) });
    if (this.ySl != null)
      this.ySl.pause();
    AppMethodBeat.o(31727);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31728);
    super.dxC();
    ab.i("MicroMsg.StoryStateComponent", "onChattingExitAnimStart: hashCode:%s", new Object[] { Integer.valueOf(hashCode()) });
    dEY();
    h localh = h.scu;
    h.cAs().fA("");
    localh = h.scu;
    h.cAs().cZK = 0L;
    localh = h.scu;
    h.cAs().cZr = 0L;
    localh = h.scu;
    h.cAA().fs("");
    localh = h.scu;
    h.cAA().cZr = 0L;
    AppMethodBeat.o(31728);
  }

  public final void dxy()
  {
    boolean bool = true;
    AppMethodBeat.i(31724);
    super.dxy();
    ab.i("MicroMsg.StoryStateComponent", "onChattingEnterAnimStart: user %s hashCode:%s", new Object[] { this.cgL.getTalkerUserName(), Integer.valueOf(hashCode()) });
    this.cgL.yTx.removeOptionMenu(3);
    this.pls = false;
    this.rXd = false;
    this.ySm.clear();
    this.sbP.clear();
    this.cvF = "";
    this.ySo = false;
    ((j)this.cgL.aF(j.class)).Oz(0);
    Object localObject = this.cgL.getTalkerUserName();
    if (c.isNullOrNil((String)localObject));
    label412: label417: label433: 
    while (true)
    {
      bool = false;
      localObject = this;
      ((al)localObject).ySn = bool;
      if (this.ySn)
      {
        this.ySl = ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryStateFetcher(this.cgL.getTalkerUserName());
        if (this.ySl != null)
        {
          this.ySl.a(this);
          this.ySl.start();
        }
      }
      localObject = h.scu;
      h.cAy().fl(this.cgL.getTalkerUserName());
      localObject = h.scu;
      localObject = h.cAy();
      long l;
      if (this.mgQ)
      {
        l = 4L;
        label233: ((aj)localObject).cYQ = l;
        localObject = h.scu;
        localObject = h.cAy();
        if (!this.rXd)
          break label412;
        l = 1L;
        label255: ((aj)localObject).cYR = l;
        if (!this.mgQ)
          break label417;
      }
      for (this.cgL.yTB = com.tencent.mm.ui.e.aqC("4"); ; this.cgL.yTB = com.tencent.mm.ui.e.aqC("5"))
      {
        this.cvF = this.cgL.dFt();
        AppMethodBeat.o(31724);
        return;
        this.mgQ = t.kH((String)localObject);
        if (t.mO((String)localObject))
        {
          bool = t.mO((String)localObject);
          localObject = this;
          break;
        }
        if ((t.mR((String)localObject)) || (t.mZ((String)localObject)) || (t.mU((String)localObject)) || (t.mV((String)localObject)) || (t.nc((String)localObject)) || (t.nd((String)localObject)) || (t.nD((String)localObject)) || (t.nI((String)localObject)) || (t.no((String)localObject)) || (t.mP((String)localObject)) || (t.mO((String)localObject)))
          break label433;
        localObject = this;
        break;
        l = 5L;
        break label233;
        l = 0L;
        break label255;
      }
    }
  }

  public final void dxz()
  {
    AppMethodBeat.i(31725);
    super.dxz();
    ab.i("MicroMsg.StoryStateComponent", "onChattingEnterAnimEnd: hashCode:%s", new Object[] { Integer.valueOf(hashCode()) });
    AppMethodBeat.o(31725);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.al
 * JD-Core Version:    0.6.2
 */