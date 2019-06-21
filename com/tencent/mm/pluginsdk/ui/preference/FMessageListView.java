package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.jb;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.bu;

public class FMessageListView extends LinearLayout
{
  private boolean cPo;
  private Context context;
  private final LinearLayout.LayoutParams njH;
  private a.a vqm;
  private com.tencent.mm.pluginsdk.c.a vqt;
  private k.a vqu;
  private k.a vqv;
  private FMessageListView.a vqw;
  private a vqx;
  private TextView vqy;

  public FMessageListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FMessageListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(28043);
    this.vqt = new FMessageListView.1(this);
    this.vqu = new FMessageListView.2(this);
    this.vqv = new FMessageListView.3(this);
    this.njH = new LinearLayout.LayoutParams(-1, -2);
    this.cPo = false;
    this.context = paramContext;
    AppMethodBeat.o(28043);
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(28048);
    if (paramb == null)
    {
      ab.e("MicroMsg.FMessageListView", "addItem fail, provider is null");
      AppMethodBeat.o(28048);
    }
    while (true)
    {
      return;
      if (paramb.id > 0L)
        break;
      ab.e("MicroMsg.FMessageListView", "addItem fail, systemRowId invalid = " + paramb.id);
      AppMethodBeat.o(28048);
    }
    int i = getChildCount();
    Object localObject1;
    for (int j = 1; ; j++)
    {
      if (j >= i)
        break label159;
      localObject1 = getChildAt(j);
      if (((localObject1 instanceof a)) && (((View)localObject1).getTag() != null) && (((View)localObject1).getTag().equals(Long.valueOf(paramb.id))))
      {
        ab.w("MicroMsg.FMessageListView", "addItem, item repeated, sysRowId = " + paramb.id);
        AppMethodBeat.o(28048);
        break;
      }
    }
    label159: if (paramb.vqC != null)
    {
      if (this.vqy == null)
        this.vqy = ((TextView)findViewById(2131823029));
      this.vqy.setText(paramb.vqC);
      this.vqy.setVisibility(0);
    }
    ab.d("MicroMsg.FMessageListView", "addItem, current child count = ".concat(String.valueOf(i)));
    if (i == 6)
    {
      ab.i("MicroMsg.FMessageListView", "addItem, most 3 FMessageItemView, remove earliest");
      removeViewAt(1);
    }
    if (i == 1)
    {
      ab.d("MicroMsg.FMessageListView", "addItem, current child count is 0, add two child view");
      this.vqw = new FMessageListView.a(this.context);
      addView(this.vqw);
      this.vqx = new a(this.context);
      this.vqx.setContentText("");
      this.vqx.setBtnVisibility(0);
      addView(this.vqx, this.njH);
      aw.ZK();
      localObject1 = c.XM().aoO(paramb.username);
      if ((localObject1 != null) && (com.tencent.mm.n.a.jh(((ap)localObject1).field_type)))
        break label510;
      ab.d("MicroMsg.FMessageListView", "addItem, reply btn visible, talker = " + paramb.username);
      this.vqw.setVisibility(0);
      this.vqx.setVisibility(0);
    }
    Object localObject2;
    while (true)
    {
      if (!paramb.cRY)
        break label556;
      localObject1 = this.context.getString(2131299914, new Object[] { paramb.fjz });
      j = 0;
      localObject2 = new a(this.context);
      ((a)localObject2).setTag(Long.valueOf(paramb.id));
      ((a)localObject2).setContentText((String)localObject1);
      ((a)localObject2).setBtnVisibility(8);
      if (j != 0)
        ((a)localObject2).setOnLongClickListener(new FMessageListView.4(this, paramb));
      addView((View)localObject2, getChildCount() - 2, this.njH);
      AppMethodBeat.o(28048);
      break;
      label510: ab.d("MicroMsg.FMessageListView", "addItem, reply btn gone, talker = " + paramb.username);
      this.vqw.setVisibility(8);
      this.vqx.setVisibility(8);
    }
    label556: if ((paramb.nickname != null) && (paramb.nickname.length() > 0))
      localObject1 = paramb.nickname;
    while (true)
    {
      localObject1 = (String)localObject1 + ": " + paramb.fjz;
      j = 1;
      break;
      localObject2 = paramb.username;
      aw.ZK();
      ad localad = c.XM().aoO(paramb.username);
      localObject1 = localObject2;
      if (localad != null)
      {
        localObject1 = localObject2;
        if ((int)localad.ewQ > 0)
          localObject1 = localad.Oj();
      }
    }
  }

  public final void detach()
  {
    AppMethodBeat.i(28047);
    d.akO().d(this.vqu);
    d.akQ().d(this.vqu);
    com.tencent.mm.pluginsdk.c.a.b(jb.class.getName(), this.vqt);
    d.akR().d(this.vqv);
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if ((localView instanceof a))
        ((a)localView).detach();
    }
    this.vqw = null;
    this.vqx = null;
    AppMethodBeat.o(28047);
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(28046);
    super.onAttachedToWindow();
    d.akO().c(this.vqu);
    com.tencent.mm.pluginsdk.c.a.a(jb.class.getName(), this.vqt);
    d.akQ().c(this.vqu);
    d.akR().c(this.vqv);
    AppMethodBeat.o(28046);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(28045);
    super.onDetachedFromWindow();
    detach();
    AppMethodBeat.o(28045);
  }

  public void setFMessageArgs(a.a parama)
  {
    AppMethodBeat.i(28044);
    this.vqm = parama;
    a.setFMessageArgs(parama);
    AppMethodBeat.o(28044);
  }

  public void setHide(boolean paramBoolean)
  {
    this.cPo = paramBoolean;
  }

  public void setReplyBtnVisible(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(28049);
    int j = getChildCount();
    ab.d("MicroMsg.FMessageListView", "setReplyBtnVisible, visible = " + paramBoolean + ", current child count = " + j);
    if (j <= 2)
    {
      ab.e("MicroMsg.FMessageListView", "setReplyBtnVisible fail, childCount invalid = ".concat(String.valueOf(j)));
      AppMethodBeat.o(28049);
      return;
    }
    Object localObject;
    if (this.vqw != null)
    {
      localObject = this.vqw;
      if (paramBoolean)
      {
        j = 0;
        label91: ((FMessageListView.a)localObject).setVisibility(j);
      }
    }
    else if (this.vqx != null)
    {
      localObject = this.vqx;
      if (!paramBoolean)
        break label137;
    }
    label137: for (j = i; ; j = 8)
    {
      ((a)localObject).setVisibility(j);
      AppMethodBeat.o(28049);
      break;
      j = 8;
      break label91;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.FMessageListView
 * JD-Core Version:    0.6.2
 */