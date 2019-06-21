package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class KeyValuePreference extends Preference
{
  private View contentView;
  protected TextView gne;
  public float nnX;
  protected TextView pnu;
  public boolean yCj;
  private boolean yCk;
  private boolean yCl;
  private boolean yCm;
  private int yCn;
  private int yCo;
  public int yCp;
  protected ImageView yCq;
  public Drawable yCr;
  private List<View> yCs;
  public int yCt;
  int yCu;
  public String ylA;

  public KeyValuePreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public KeyValuePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public KeyValuePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107201);
    this.yCj = true;
    this.yCk = false;
    this.ylA = null;
    this.yCl = false;
    this.yCm = false;
    this.yCn = 17;
    this.yCo = 17;
    this.yCp = 0;
    this.yCq = null;
    this.yCr = null;
    this.yCs = new LinkedList();
    setLayoutResource(2130970127);
    AppMethodBeat.o(107201);
  }

  public final void NT(int paramInt)
  {
    AppMethodBeat.i(107204);
    this.yCu = paramInt;
    if (this.pnu != null)
      this.pnu.setMaxLines(this.yCu);
    AppMethodBeat.o(107204);
  }

  public final void dAB()
  {
    this.yCm = true;
    this.yCo = 5;
  }

  public final void dAC()
  {
    AppMethodBeat.i(107206);
    this.yCs.clear();
    AppMethodBeat.o(107206);
  }

  public final void dAD()
  {
    this.yCl = true;
    this.yCn = 49;
  }

  public final void eI(View paramView)
  {
    AppMethodBeat.i(107207);
    this.yCs.add(paramView);
    AppMethodBeat.o(107207);
  }

  public void onBindView(View paramView)
  {
    AppMethodBeat.i(107203);
    super.onBindView(paramView);
    this.contentView = paramView.findViewById(2131821019);
    if (this.yCX != null)
      this.contentView.setOnClickListener(new KeyValuePreference.1(this));
    if (this.yCY != null)
      paramView.setOnLongClickListener(new KeyValuePreference.2(this));
    this.pnu = ((TextView)paramView.findViewById(16908304));
    if (this.pnu != null)
    {
      this.pnu.setSingleLine(this.yCj);
      if (this.yCm)
        this.pnu.setGravity(this.yCo);
    }
    if (this.yCk)
      setWidgetLayoutResource(2130970202);
    this.gne = ((TextView)paramView.findViewById(16908310));
    if (!bo.isNullOrNil(this.ylA))
      this.gne.setText(this.ylA);
    Object localObject;
    int i;
    if (this.gne != null)
    {
      localObject = this.gne.getLayoutParams();
      if (this.yCt == 0)
      {
        i = a.al(this.mContext, 2131427668);
        ((ViewGroup.LayoutParams)localObject).width = i;
        this.gne.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
    }
    else
    {
      this.yCq = ((ImageView)paramView.findViewById(2131822184));
      if (this.yCr == null)
        break label368;
      this.yCq.setVisibility(this.yCp);
      this.yCq.setImageDrawable(this.yCr);
    }
    while (true)
    {
      if (this.yCl)
      {
        localObject = (LinearLayout)paramView.findViewById(2131821064);
        if (localObject != null)
          ((LinearLayout)localObject).setGravity(this.yCn);
      }
      if (this.yCs.size() <= 0)
        break label380;
      paramView = (LinearLayout)paramView.findViewById(2131826040);
      paramView.removeAllViews();
      localObject = this.yCs.iterator();
      while (((Iterator)localObject).hasNext())
      {
        View localView = (View)((Iterator)localObject).next();
        ViewGroup localViewGroup = (ViewGroup)localView.getParent();
        if (localViewGroup != null)
          localViewGroup.removeView(localView);
        paramView.addView(localView);
      }
      i = this.yCt;
      break;
      label368: this.yCq.setVisibility(8);
    }
    label380: if (this.nnX != 0.0F)
    {
      this.gne.setTextSize(this.nnX);
      this.pnu.setTextSize(this.nnX);
    }
    if (this.yCu > 0)
      this.pnu.setMaxLines(this.yCu);
    AppMethodBeat.o(107203);
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107202);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(2131821019);
    localViewGroup.removeAllViews();
    paramViewGroup.inflate(2130970153, localViewGroup);
    AppMethodBeat.o(107202);
    return localView;
  }

  public final void qi(boolean paramBoolean)
  {
    AppMethodBeat.i(107205);
    this.yCk = paramBoolean;
    if (this.yCk)
      setWidgetLayoutResource(2130970202);
    AppMethodBeat.o(107205);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.KeyValuePreference
 * JD-Core Version:    0.6.2
 */