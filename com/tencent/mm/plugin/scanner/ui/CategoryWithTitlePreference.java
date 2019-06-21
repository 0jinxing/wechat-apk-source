package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.scanner.util.q;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public final class CategoryWithTitlePreference extends Preference
  implements x.a
{
  private int cIZ;
  private int cJa;
  private Context context;
  private f ehK;
  private TextView gne;
  private String iconUrl;
  private ImageView iyo;
  private String title;

  public CategoryWithTitlePreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public CategoryWithTitlePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CategoryWithTitlePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(81001);
    this.title = "";
    this.cIZ = 34;
    this.cJa = 34;
    setLayoutResource(2130970133);
    this.context = paramContext;
    x.a(this);
    AppMethodBeat.o(81001);
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(81005);
    ab.d("MicroMsg.scanner.CategoryWithTitlePreference", "get pic:" + paramString + ", iconurl:" + this.iconUrl);
    if ((!bo.isNullOrNil(paramString)) && (paramString.equals(this.iconUrl)) && (paramBitmap != null) && (!paramBitmap.isRecycled()) && (this.iyo != null))
      al.d(new CategoryWithTitlePreference.1(this, paramBitmap));
    AppMethodBeat.o(81005);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(81004);
    super.onBindView(paramView);
    this.gne = ((TextView)paramView.findViewById(16908310));
    this.iyo = ((ImageView)paramView.findViewById(2131820915));
    paramView = this.iyo.getLayoutParams();
    paramView.width = BackwardSupportUtil.b.b(this.context, this.cIZ / 2);
    paramView.height = BackwardSupportUtil.b.b(this.context, this.cJa / 2);
    this.iyo.setLayoutParams(paramView);
    if ((this.title != null) && (this.title.length() > 0) && (this.gne != null))
    {
      this.gne.setVisibility(0);
      this.gne.setText(this.title);
      ab.v("MicroMsg.scanner.CategoryWithTitlePreference", "onBindView title : " + this.gne.getText());
    }
    if (!bo.isNullOrNil(this.iconUrl))
    {
      paramView = x.a(new q(this.iconUrl));
      if ((paramView != null) && (!paramView.isRecycled()))
      {
        this.iyo.setImageBitmap(paramView);
        this.iyo.setVisibility(0);
      }
    }
    AppMethodBeat.o(81004);
  }

  public final void setTitle(int paramInt)
  {
    AppMethodBeat.i(81003);
    if (this.gne != null)
    {
      if (this.context != null)
        this.title = this.context.getString(paramInt);
      if (bo.isNullOrNil(this.title))
        break label71;
      this.gne.setVisibility(0);
      this.gne.setText(this.title);
    }
    while (true)
    {
      super.setTitle(paramInt);
      AppMethodBeat.o(81003);
      return;
      label71: this.gne.setVisibility(8);
    }
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(81002);
    if ((paramCharSequence != null) && (paramCharSequence.length() > 0))
    {
      this.title = paramCharSequence.toString();
      if (this.gne != null)
      {
        this.gne.setVisibility(0);
        this.gne.setText(paramCharSequence);
        ab.v("MicroMsg.scanner.CategoryWithTitlePreference", "title : " + this.gne.getText());
      }
    }
    while (true)
    {
      super.setTitle(paramCharSequence);
      AppMethodBeat.o(81002);
      return;
      if (this.gne != null)
        this.gne.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.CategoryWithTitlePreference
 * JD-Core Version:    0.6.2
 */