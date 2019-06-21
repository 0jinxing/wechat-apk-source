package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMFrameLayout;
import java.util.ArrayList;

public class PhotosContent extends MMFrameLayout
{
  private int hrp;
  public ArrayList<TagImageView> rlN;
  private float rlO;

  public PhotosContent(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38474);
    this.rlN = new ArrayList();
    this.hrp = 120;
    AppMethodBeat.o(38474);
  }

  public final TagImageView DT(int paramInt)
  {
    AppMethodBeat.i(38473);
    TagImageView localTagImageView;
    if (paramInt < this.rlN.size())
    {
      localTagImageView = (TagImageView)this.rlN.get(paramInt);
      AppMethodBeat.o(38473);
    }
    while (true)
    {
      return localTagImageView;
      localTagImageView = null;
      AppMethodBeat.o(38473);
    }
  }

  public final void a(TagImageView paramTagImageView)
  {
    AppMethodBeat.i(38471);
    this.rlN.add(paramTagImageView);
    AppMethodBeat.o(38471);
  }

  public final void csr()
  {
    AppMethodBeat.i(38470);
    this.rlN.clear();
    AppMethodBeat.o(38470);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38475);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(38475);
  }

  public void setImageViewWidth(int paramInt)
  {
    AppMethodBeat.i(38472);
    if (paramInt <= 0)
      AppMethodBeat.o(38472);
    while (true)
    {
      return;
      this.rlO = getResources().getDisplayMetrics().density;
      this.hrp = ((int)(this.hrp * this.rlO));
      if (paramInt < this.hrp);
      Object localObject1;
      while (true)
      {
        for (i = 0; i < this.rlN.size(); i++)
        {
          localObject1 = getChildAt(i);
          Object localObject2 = new ViewGroup.MarginLayoutParams(((View)localObject1).getLayoutParams());
          ((ViewGroup.MarginLayoutParams)localObject2).width = paramInt;
          ((ViewGroup.MarginLayoutParams)localObject2).height = paramInt;
          ((ViewGroup.MarginLayoutParams)localObject2).leftMargin = ((int)(i % 3 * (paramInt + this.rlO * 3.0F)));
          ((ViewGroup.MarginLayoutParams)localObject2).topMargin = ((int)(i / 3 * (paramInt + this.rlO * 3.0F)));
          localObject2 = new FrameLayout.LayoutParams((ViewGroup.MarginLayoutParams)localObject2);
          ((FrameLayout.LayoutParams)localObject2).gravity = 51;
          ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        paramInt = this.hrp;
      }
      int i = this.rlN.size() / 3;
      if (i > 0)
      {
        localObject1 = (ViewGroup.MarginLayoutParams)getLayoutParams();
        float f1 = paramInt * i;
        float f2 = this.rlO;
        ((ViewGroup.MarginLayoutParams)localObject1).height = ((int)((i - 1) * (f2 * 3.0F) + f1));
        setLayoutParams((ViewGroup.LayoutParams)localObject1);
      }
      AppMethodBeat.o(38472);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.PhotosContent
 * JD-Core Version:    0.6.2
 */