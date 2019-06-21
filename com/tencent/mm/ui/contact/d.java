package com.tencent.mm.ui.contact;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.p;
import java.util.List;

public final class d extends p<ad>
{
  protected MMActivity crP;
  protected List<String> elZ;
  com.tencent.mm.ui.applet.b gvm;
  private b.b gvn;
  protected MMSlideDelView.g jJO;
  protected MMSlideDelView.c jJP;
  protected MMSlideDelView.d jJR;
  protected MMSlideDelView.f oQS;
  com.tencent.mm.pluginsdk.ui.d vkK;
  protected String zjx;

  public d(Context paramContext, String paramString)
  {
    super(paramContext, new ad());
    AppMethodBeat.i(33563);
    this.zjx = null;
    this.elZ = null;
    this.jJR = MMSlideDelView.getItemStatusCallBack();
    this.gvm = null;
    this.gvn = null;
    this.crP = ((MMActivity)paramContext);
    this.zjx = paramString;
    this.gvm = new com.tencent.mm.ui.applet.b(new d.1(this));
    AppMethodBeat.o(33563);
  }

  private void a(a parama, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(33568);
    ad localad = (ad)getItem(paramInt1 + 1);
    if ((localad == null) || ((localad.field_showHead != paramInt2) && (!ah.isNullOrNil(ag(localad)))))
      parama.zlo.setBackgroundResource(0);
    AppMethodBeat.o(33568);
  }

  private String ag(ad paramad)
  {
    AppMethodBeat.i(33569);
    if (paramad.field_showHead == 31)
    {
      paramad = "";
      AppMethodBeat.o(33569);
    }
    while (true)
    {
      return paramad;
      if (paramad.field_showHead == 43)
      {
        paramad = this.crP.getString(2131302552);
        AppMethodBeat.o(33569);
      }
      else
      {
        paramad = String.valueOf((char)paramad.field_showHead);
        AppMethodBeat.o(33569);
      }
    }
  }

  public final void KC()
  {
    try
    {
      AppMethodBeat.i(33566);
      aw.ZK();
      Cursor localCursor = c.XM().c(this.zjx, "", this.elZ);
      bIf();
      setCursor(localCursor);
      notifyDataSetChanged();
      AppMethodBeat.o(33566);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(33565);
    KC();
    AppMethodBeat.o(33565);
  }

  public final void a(MMSlideDelView.f paramf)
  {
    this.oQS = paramf;
  }

  public final int getCount()
  {
    AppMethodBeat.i(33564);
    int i = getCursor().getCount();
    AppMethodBeat.o(33564);
    return i;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(33567);
    if (this.gvn == null)
      this.gvn = new d.2(this);
    if (this.gvm != null)
      this.gvm.a(paramInt, this.gvn);
    Object localObject1;
    if (paramView == null)
    {
      paramView = View.inflate(this.crP, 2130969004, null);
      paramViewGroup = new a();
      paramViewGroup.nBN = ((TextView)paramView.findViewById(2131821069));
      paramViewGroup.emP = ((MaskLayout)paramView.findViewById(2131821072));
      paramViewGroup.emg = ((TextView)paramView.findViewById(2131821079));
      paramViewGroup.zlo = ((ViewGroup)paramView.findViewById(2131821071));
      localObject1 = paramViewGroup.zlo.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).height = ((int)(com.tencent.mm.bz.a.am(this.crP, 2131427553) * com.tencent.mm.bz.a.fZ(this.crP)));
      paramViewGroup.zlo.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      localObject1 = (ad)getItem(paramInt - 1);
      int i;
      label185: Object localObject2;
      if (localObject1 == null)
      {
        i = -1;
        localObject1 = (ad)getItem(paramInt);
        if (paramInt != 0)
          break label464;
        localObject2 = ag((ad)localObject1);
        if (!ah.isNullOrNil((String)localObject2))
          break label433;
        ab.w("MicroMsg.ChatroomContactAdapter", "get display show head return null, user[%s] pos[%d]", new Object[] { ((ap)localObject1).field_username, Integer.valueOf(paramInt) });
        paramViewGroup.nBN.setVisibility(8);
        label252: if (getItem(paramInt + 1) == null)
          paramViewGroup.zlo.setBackgroundResource(0);
        label270: localObject2 = paramViewGroup.emg;
        MMActivity localMMActivity = this.crP;
        if (t.nI(((ap)localObject1).field_username))
          break label637;
        paramInt = 2131690750;
        label297: ((TextView)localObject2).setTextColor(com.tencent.mm.bz.a.h(localMMActivity, paramInt));
        localObject2 = (ImageView)paramViewGroup.emP.getContentView();
        a.b.b((ImageView)localObject2, ((ap)localObject1).field_username);
        localObject2 = (com.tencent.mm.pluginsdk.ui.a)((ImageView)localObject2).getDrawable();
        if (this.vkK != null)
          this.vkK.a((com.tencent.mm.pluginsdk.ui.d.a)localObject2);
        paramViewGroup.emP.setMaskDrawable(null);
      }
      try
      {
        if (t.mP(((ap)localObject1).field_username))
          ((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).a(this.crP, paramViewGroup.emg, s.mJ(((ap)localObject1).field_username));
        while (true)
        {
          AppMethodBeat.o(33567);
          return paramView;
          paramViewGroup = (a)paramView.getTag();
          break;
          i = ((ap)localObject1).field_showHead;
          break label185;
          label433: paramViewGroup.nBN.setVisibility(0);
          paramViewGroup.nBN.setText((CharSequence)localObject2);
          paramViewGroup.nBN.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
          break label252;
          label464: if ((paramInt > 0) && (((ap)localObject1).field_showHead != i))
          {
            localObject2 = ag((ad)localObject1);
            paramViewGroup.zlo.setBackgroundResource(2130838396);
            if (ah.isNullOrNil((String)localObject2))
            {
              ab.w("MicroMsg.ChatroomContactAdapter", "get display show head return null, user[%s] pos[%d]", new Object[] { ((ap)localObject1).field_username, Integer.valueOf(paramInt) });
              paramViewGroup.nBN.setVisibility(8);
            }
            while (true)
            {
              a(paramViewGroup, paramInt, i);
              break;
              paramViewGroup.nBN.setVisibility(0);
              paramViewGroup.nBN.setText((CharSequence)localObject2);
              if (((ap)localObject1).field_showHead == 32)
              {
                paramViewGroup.nBN.setCompoundDrawablesWithIntrinsicBounds(2130839534, 0, 0, 0);
                paramViewGroup.nBN.setCompoundDrawablePadding(2);
              }
              else
              {
                paramViewGroup.nBN.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
              }
            }
          }
          paramViewGroup.nBN.setVisibility(8);
          a(paramViewGroup, paramInt, i);
          break label270;
          label637: paramInt = 2131690751;
          break label297;
          localObject1 = j.b(this.crP, s.mJ(((ap)localObject1).field_username), (int)paramViewGroup.emg.getTextSize());
          paramViewGroup.emg.setText((CharSequence)localObject1);
        }
      }
      catch (Exception localException)
      {
        while (true)
          paramViewGroup.emg.setText("");
      }
    }
  }

  public final void setGetViewPositionCallback(MMSlideDelView.c paramc)
  {
    this.jJP = paramc;
  }

  public final void setPerformItemClickListener(MMSlideDelView.g paramg)
  {
    this.jJO = paramg;
  }

  protected static final class a
  {
    public MaskLayout emP;
    public TextView emg;
    public TextView nBN;
    public ViewGroup zlo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.d
 * JD-Core Version:    0.6.2
 */