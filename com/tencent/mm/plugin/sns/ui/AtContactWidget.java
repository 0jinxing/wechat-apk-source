package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ah;
import com.tencent.mm.ui.tools.r;
import com.tencent.mm.ui.v;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AtContactWidget extends LinearLayout
{
  private View contentView;
  private Activity gNy;
  private TextView iyE;
  private ImageView rhd;
  private TextView rhe;
  private PreviewContactView rhf;
  SnsUploadConfigView rhg;
  private List<String> rhh;
  private boolean rhi;

  public AtContactWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38153);
    this.rhh = new LinkedList();
    this.rhi = false;
    init(paramContext);
    AppMethodBeat.o(38153);
  }

  @TargetApi(11)
  public AtContactWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(38152);
    this.rhh = new LinkedList();
    this.rhi = false;
    init(paramContext);
    AppMethodBeat.o(38152);
  }

  private void crB()
  {
    AppMethodBeat.i(38158);
    if (this.rhh.size() > 0)
    {
      this.rhd.setImageDrawable(ah.f(this.gNy, getWithDrawableId(), getContext().getResources().getColor(2131690683)));
      AppMethodBeat.o(38158);
    }
    while (true)
    {
      return;
      this.rhd.setImageDrawable(ah.f(this.gNy, getWithEmptyDrawableId(), -16777216));
      AppMethodBeat.o(38158);
    }
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(38156);
    this.gNy = ((Activity)paramContext);
    this.contentView = v.hu(paramContext).inflate(getLayoutResource(), this);
    this.rhf = ((PreviewContactView)this.contentView.findViewById(2131821516));
    this.rhd = ((ImageView)this.contentView.findViewById(2131821514));
    this.rhe = ((TextView)this.contentView.findViewById(2131827564));
    this.iyE = ((TextView)this.contentView.findViewById(2131821515));
    this.contentView.setOnClickListener(new AtContactWidget.1(this));
    this.contentView.post(new AtContactWidget.2(this));
    AppMethodBeat.o(38156);
  }

  public final boolean ao(Intent paramIntent)
  {
    AppMethodBeat.i(38157);
    paramIntent = paramIntent.getStringExtra("Select_Contact");
    new LinkedList();
    if ((paramIntent == null) || (paramIntent.equals("")));
    Object localObject1;
    Object localObject2;
    for (paramIntent = new LinkedList(); ; paramIntent = bo.P(paramIntent.split(",")))
    {
      if (this.rhh == null)
        this.rhh = new LinkedList();
      this.rhh.clear();
      localObject1 = paramIntent.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        if (!this.rhh.contains(localObject2))
          this.rhh.add(localObject2);
      }
    }
    if (this.rhf != null)
      this.rhf.setList(this.rhh);
    int i;
    if (this.iyE != null)
    {
      localObject2 = this.iyE;
      localObject1 = getResources();
      if (paramIntent.isEmpty())
      {
        i = 2131690316;
        ((TextView)localObject2).setTextColor(((Resources)localObject1).getColor(i));
      }
    }
    else if (this.rhi)
    {
      ab.d("MicroMsg.AtContactWiget", "withList count " + this.rhh.size());
      if ((!this.rhi) || (this.rhe == null) || (this.rhh.size() <= 0))
        break label363;
      this.rhe.setVisibility(0);
      if (this.rhh.size() >= 100)
        break label341;
      this.rhe.setText(this.rhh.size());
      this.rhe.setBackgroundResource(r.ik(getContext()));
    }
    while (true)
    {
      crB();
      AppMethodBeat.o(38157);
      return true;
      i = 2131690135;
      break;
      label341: this.rhe.setText("");
      this.rhe.setBackgroundResource(2131230952);
      continue;
      label363: this.rhe.setVisibility(8);
    }
  }

  public final void crA()
  {
    AppMethodBeat.i(38155);
    if (this.rhh == null)
      this.rhh = new LinkedList();
    this.rhh.clear();
    if (this.rhf != null)
      this.rhf.setList(this.rhh);
    crB();
    if (this.rhe != null)
      this.rhe.setVisibility(8);
    if (this.iyE != null)
      this.iyE.setTextColor(getResources().getColor(2131690316));
    AppMethodBeat.o(38155);
  }

  public List<String> getAtList()
  {
    AppMethodBeat.i(38154);
    if (this.rhh == null)
      this.rhh = new LinkedList();
    List localList = this.rhh;
    AppMethodBeat.o(38154);
    return localList;
  }

  protected int getLayoutResource()
  {
    return 2130968780;
  }

  protected int getWithDrawableId()
  {
    return 2131230779;
  }

  protected int getWithEmptyDrawableId()
  {
    return 2131230778;
  }

  public void setShowAtList(boolean paramBoolean)
  {
    AppMethodBeat.i(38159);
    PreviewContactView localPreviewContactView;
    if (this.rhf != null)
    {
      localPreviewContactView = this.rhf;
      if (!paramBoolean)
        break label36;
    }
    label36: for (int i = 0; ; i = 8)
    {
      localPreviewContactView.setVisibility(i);
      AppMethodBeat.o(38159);
      return;
    }
  }

  public void setShowAtNum(boolean paramBoolean)
  {
    this.rhi = paramBoolean;
  }

  public void setShowAtTips(boolean paramBoolean)
  {
    AppMethodBeat.i(38160);
    TextView localTextView;
    if ((this.contentView != null) && (this.iyE != null))
    {
      localTextView = this.iyE;
      if (!paramBoolean)
        break label43;
    }
    label43: for (int i = 0; ; i = 8)
    {
      localTextView.setVisibility(i);
      AppMethodBeat.o(38160);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.AtContactWidget
 * JD-Core Version:    0.6.2
 */