package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.c;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog;", "Landroid/support/design/widget/BottomSheetDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "delete", "Landroid/view/View;", "deleteIcon", "Landroid/widget/ImageView;", "favorite", "favoriteIcon", "favoriteTv", "Landroid/widget/TextView;", "isFavorite", "", "()Z", "setFavorite", "(Z)V", "isPrivacy", "setPrivacy", "onDelete", "Lkotlin/Function0;", "", "getOnDelete", "()Lkotlin/jvm/functions/Function0;", "setOnDelete", "(Lkotlin/jvm/functions/Function0;)V", "onResend", "getOnResend", "setOnResend", "onSetFavorite", "getOnSetFavorite", "setOnSetFavorite", "onSetPrivacy", "getOnSetPrivacy", "setOnSetPrivacy", "privacy", "privacyIcon", "privacyTv", "resend", "resendIcon", "showDelete", "getShowDelete", "setShowDelete", "showFavorite", "getShowFavorite", "setShowFavorite", "showPrivacy", "getShowPrivacy", "setShowPrivacy", "showResend", "getShowResend", "setShowResend", "initDelBtn", "initFavoriteBtn", "initPrivacyBtn", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "plugin-story_release"})
public final class a extends c
{
  boolean ixx;
  private ImageView lnv;
  boolean rYr;
  boolean rvv;
  private View slL;
  private TextView slM;
  private ImageView slN;
  private View snm;
  private View snn;
  private View sno;
  private ImageView snp;
  private ImageView snq;
  private TextView snr;
  a.f.a.a<y> sns;
  a.f.a.a<y> snt;
  a.f.a.a<y> snu;
  a.f.a.a<y> snv;
  boolean snw;
  boolean snx;
  boolean sny;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(110703);
    this.ixx = true;
    this.snx = true;
    this.sny = true;
    setContentView(2130970875);
    AppMethodBeat.o(110703);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(110702);
    super.onCreate(paramBundle);
    paramBundle = getWindow();
    if (paramBundle != null)
    {
      paramBundle.addFlags(134218752);
      paramBundle.clearFlags(2);
    }
    this.snm = findViewById(2131828097);
    this.snn = findViewById(2131828089);
    this.sno = findViewById(2131828094);
    this.lnv = ((ImageView)findViewById(2131828098));
    this.snp = ((ImageView)findViewById(2131828090));
    this.snq = ((ImageView)findViewById(2131828095));
    this.snr = ((TextView)findViewById(2131828096));
    this.slL = findViewById(2131828091);
    this.slL = findViewById(2131828091);
    this.slM = ((TextView)findViewById(2131828093));
    this.slN = ((ImageView)findViewById(2131828092));
    paramBundle = getContext();
    j.o(paramBundle, "context");
    int i = paramBundle.getResources().getColor(2131689602);
    paramBundle = this.lnv;
    if (paramBundle != null)
      paramBundle.setImageDrawable(ah.f(getContext(), 2131231203, i));
    paramBundle = this.snp;
    if (paramBundle != null)
      paramBundle.setImageDrawable(ah.f(getContext(), 2131231484, -16777216));
    paramBundle = this.slN;
    if (paramBundle != null)
      paramBundle.setImageDrawable(ah.f(getContext(), 2131231491, -16777216));
    paramBundle = this.snn;
    if (paramBundle != null)
      paramBundle.setOnClickListener((View.OnClickListener)new a.d(this));
    if (this.snw)
    {
      paramBundle = this.snn;
      if (paramBundle != null)
        paramBundle.setVisibility(0);
    }
    if (this.ixx)
    {
      paramBundle = this.snm;
      if (paramBundle != null)
        paramBundle.setVisibility(0);
      paramBundle = this.snm;
      if (paramBundle != null)
        paramBundle.setOnClickListener((View.OnClickListener)new a.a(this));
      if (!this.snx)
        break label625;
      paramBundle = this.sno;
      if (paramBundle != null)
        paramBundle.setVisibility(0);
      paramBundle = this.sno;
      if (paramBundle != null)
        paramBundle.setOnClickListener((View.OnClickListener)new a.c(this));
      if (!this.rvv)
        break label571;
      paramBundle = this.snq;
      if (paramBundle != null)
        paramBundle.setImageDrawable(ah.f(getContext(), 2131231492, -16777216));
      paramBundle = this.snr;
      if (paramBundle != null)
        paramBundle.setText((CharSequence)getContext().getString(2131306004));
      label441: if ((!this.sny) || (!com.tencent.mm.plugin.story.c.a.a.rQZ.cwU()))
        break label672;
      paramBundle = this.slL;
      if (paramBundle != null)
        paramBundle.setVisibility(0);
      paramBundle = this.slL;
      if (paramBundle != null)
        paramBundle.setOnClickListener((View.OnClickListener)new a.b(this));
      if (!this.rYr)
        break label643;
      paramBundle = this.slM;
      if (paramBundle != null)
        paramBundle.setText((CharSequence)getContext().getString(2131306003));
      label528: paramBundle = findViewById(2131823264);
      if (paramBundle == null)
        break label690;
      paramBundle.setBackgroundResource(2131690597);
      AppMethodBeat.o(110702);
    }
    while (true)
    {
      return;
      paramBundle = this.snm;
      if (paramBundle == null)
        break;
      paramBundle.setVisibility(8);
      break;
      label571: paramBundle = this.snq;
      if (paramBundle != null)
        paramBundle.setImageDrawable(ah.f(getContext(), 2131231465, -16777216));
      paramBundle = this.snr;
      if (paramBundle == null)
        break label441;
      paramBundle.setText((CharSequence)getContext().getString(2131306005));
      break label441;
      label625: paramBundle = this.sno;
      if (paramBundle == null)
        break label441;
      paramBundle.setVisibility(8);
      break label441;
      label643: paramBundle = this.slM;
      if (paramBundle == null)
        break label528;
      paramBundle.setText((CharSequence)getContext().getString(2131306002));
      break label528;
      label672: paramBundle = this.slL;
      if (paramBundle == null)
        break label528;
      paramBundle.setVisibility(8);
      break label528;
      label690: AppMethodBeat.o(110702);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.a
 * JD-Core Version:    0.6.2
 */