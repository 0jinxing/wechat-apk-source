package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.bz.a;
import com.tencent.mm.model.c;
import com.tencent.mm.modelsimple.y;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.preference.b;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.tools.r;
import java.util.List;

public final class k extends RelativeLayout
{
  public static Boolean zmx = Boolean.TRUE;
  private Context context;
  private View gbS;
  private boolean isVisible;
  private final ap yNs;
  private boolean zmA;
  private View zmy;
  k.a zmz;

  public k(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(33718);
    this.context = null;
    this.gbS = null;
    this.zmy = null;
    this.isVisible = true;
    this.yNs = new ap(new k.1(this), true);
    this.zmz = new k.2(this);
    this.zmA = false;
    this.context = paramContext;
    com.tencent.mm.bi.d.akP().c(this.zmz);
    dHQ();
    init();
    AppMethodBeat.o(33718);
  }

  private void a(av paramav)
  {
    AppMethodBeat.i(33721);
    if (this.context == null)
    {
      ab.w("MicroMsg.FMessageContactView", "initSingleNew failed. context is null.");
      AppMethodBeat.o(33721);
      return;
    }
    label49: TextView localTextView;
    Object localObject;
    boolean bool;
    if (a.ga(this.context))
    {
      this.gbS = View.inflate(this.context, 2130969575, this);
      ((TextView)this.gbS.findViewById(2131824083)).setText(j.b(this.context, paramav.field_displayName));
      localTextView = (TextView)this.gbS.findViewById(2131824084);
      ax localax = com.tencent.mm.bi.d.akO().apw(paramav.field_talker);
      localObject = this.context;
      int i = localax.field_type;
      int j = paramav.field_addScene;
      String str = localax.field_msgContent;
      if (localax.dtf())
        break label240;
      bool = true;
      label133: localObject = b.a((Context)localObject, i, j, str, bool);
      if (!ah.isNullOrNil((String)localObject))
        break label246;
      localTextView.setVisibility(8);
    }
    while (true)
    {
      this.zmy = this.gbS.findViewById(2131824076);
      this.gbS.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(33716);
          ab.d("MicroMsg.FMessageContactView", "initSingleNew, not goto ContactInfoUI, goto FMessageConversationUI");
          com.tencent.mm.model.aw.ZK();
          c.Ry().set(143618, Integer.valueOf(0));
          com.tencent.mm.bp.d.b(k.d(k.this), "subapp", ".ui.friend.FMessageConversationUI", new Intent());
          AppMethodBeat.o(33716);
        }
      });
      a.b.b((ImageView)((MaskLayout)this.gbS.findViewById(2131824078)).getContentView(), paramav.field_talker);
      AppMethodBeat.o(33721);
      break;
      this.gbS = View.inflate(this.context, 2130969574, this);
      break label49;
      label240: bool = false;
      break label133;
      label246: localTextView.setText((CharSequence)localObject);
    }
  }

  private void dHP()
  {
    AppMethodBeat.i(33720);
    if (this.context == null)
    {
      ab.w("MicroMsg.FMessageContactView", "initNoNew failed. context is null.");
      AppMethodBeat.o(33720);
    }
    while (true)
    {
      return;
      this.gbS = View.inflate(this.context, 2130969572, this);
      this.zmy = this.gbS.findViewById(2131824077);
      Object localObject = this.zmy.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = ((int)(a.am(this.context, 2131427553) * a.fZ(this.context)));
      this.zmy.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.gbS.setOnClickListener(new k.4(this));
      MaskLayout localMaskLayout = (MaskLayout)this.gbS.findViewById(2131824078);
      o.acd();
      localObject = com.tencent.mm.ah.d.qh("fmessage");
      ((ImageView)localMaskLayout.getContentView()).setImageBitmap((Bitmap)localObject);
      AppMethodBeat.o(33720);
    }
  }

  private static void dHQ()
  {
    AppMethodBeat.i(33724);
    int i = com.tencent.mm.bi.d.akP().dtd();
    ab.v("MicroMsg.FMessageContactView", "updateAddressTabUnread, newCount update to = %d", new Object[] { Integer.valueOf(i) });
    if (i > 0)
    {
      com.tencent.mm.model.aw.ZK();
      c.Ry().set(143618, Integer.valueOf(i));
    }
    AppMethodBeat.o(33724);
  }

  public static void dHR()
  {
    AppMethodBeat.i(33725);
    com.tencent.mm.model.aw.ZK();
    if (c.XI())
    {
      com.tencent.mm.model.aw.ZK();
      if (c.Ry().getInt(143618, 0) > 0)
        y.ab("fmessage", 2);
    }
    com.tencent.mm.model.aw.ZK();
    c.Ry().set(143618, Integer.valueOf(0));
    AppMethodBeat.o(33725);
  }

  private void fo(List<av> paramList)
  {
    AppMethodBeat.i(33722);
    if (this.context == null)
    {
      ab.w("MicroMsg.FMessageContactView", "initMultiNew failed. context is null.");
      AppMethodBeat.o(33722);
    }
    while (true)
    {
      return;
      this.gbS = View.inflate(this.context, 2130969573, this);
      int i = paramList.size();
      ab.d("MicroMsg.FMessageContactView", "initMultiNew, newList size = %d", new Object[] { Integer.valueOf(i) });
      Object localObject1 = (av)paramList.get(0);
      Object localObject2 = (MaskLayout)this.gbS.findViewById(2131824078);
      a.b.b((ImageView)((MaskLayout)localObject2).getContentView(), ((av)localObject1).field_talker);
      ((MaskLayout)localObject2).setVisibility(0);
      localObject2 = (av)paramList.get(1);
      localObject1 = (MaskLayout)this.gbS.findViewById(2131824080);
      a.b.b((ImageView)((MaskLayout)localObject1).getContentView(), ((av)localObject2).field_talker);
      ((MaskLayout)localObject1).setVisibility(0);
      if (i > 2)
      {
        localObject2 = (av)paramList.get(2);
        localObject1 = (MaskLayout)this.gbS.findViewById(2131824081);
        a.b.b((ImageView)((MaskLayout)localObject1).getContentView(), ((av)localObject2).field_talker);
        ((MaskLayout)localObject1).setVisibility(0);
      }
      if (i > 3)
      {
        paramList = (av)paramList.get(3);
        localObject1 = (MaskLayout)this.gbS.findViewById(2131824082);
        a.b.b((ImageView)((MaskLayout)localObject1).getContentView(), paramList.field_talker);
        ((MaskLayout)localObject1).setVisibility(0);
      }
      this.zmy = this.gbS.findViewById(2131824076);
      this.zmy.setOnClickListener(new k.6(this));
      AppMethodBeat.o(33722);
    }
  }

  private void init()
  {
    AppMethodBeat.i(33719);
    Object localObject = com.tencent.mm.bi.d.akP().dtb();
    int i = ((List)localObject).size();
    ab.d("MicroMsg.FMessageContactView", "init new fconv size = %d (max is 4)", new Object[] { Integer.valueOf(i) });
    removeAllViews();
    if (i <= 0)
    {
      dHP();
      localObject = this.gbS.findViewById(2131824076);
      if (localObject != null)
      {
        if (!this.isVisible)
          break label198;
        i = 0;
        label74: ((View)localObject).setVisibility(i);
      }
      this.zmy.setOnTouchListener(new k.3(this));
      i = com.tencent.mm.bi.d.akP().dtd();
      ab.d("MicroMsg.FMessageContactView", "init totalNewSize = %d", new Object[] { Integer.valueOf(i) });
      localObject = (TextView)this.gbS.findViewById(2131824079);
      ((TextView)localObject).setBackgroundResource(r.ik(this.context));
      if (i > 0)
        break label204;
      ((TextView)localObject).setVisibility(8);
      zmx = Boolean.FALSE;
      AppMethodBeat.o(33719);
    }
    while (true)
    {
      return;
      if (i == 1)
      {
        a((av)((List)localObject).get(0));
        break;
      }
      fo((List)localObject);
      break;
      label198: i = 8;
      break label74;
      label204: ((TextView)localObject).setVisibility(0);
      zmx = Boolean.TRUE;
      if (i > 99)
      {
        ((TextView)localObject).setText("");
        ((TextView)localObject).setBackgroundResource(2131230952);
        AppMethodBeat.o(33719);
      }
      else
      {
        ((TextView)localObject).setText(String.valueOf(i));
        ((TextView)localObject).setBackgroundResource(r.ik(this.context));
        AppMethodBeat.o(33719);
      }
    }
  }

  public final void setFrontGround(boolean paramBoolean)
  {
    this.zmA = paramBoolean;
  }

  public final void setVisible(boolean paramBoolean)
  {
    AppMethodBeat.i(33723);
    ab.d("MicroMsg.FMessageContactView", "setVisible visible = ".concat(String.valueOf(paramBoolean)));
    View localView = this.gbS.findViewById(2131824076);
    if (localView != null)
      if (!paramBoolean)
        break label58;
    label58: for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      this.isVisible = paramBoolean;
      AppMethodBeat.o(33723);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.k
 * JD-Core Version:    0.6.2
 */