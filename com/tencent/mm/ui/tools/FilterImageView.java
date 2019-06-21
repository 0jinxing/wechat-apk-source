package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PIntArray;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.base.MMHorList;
import java.io.IOException;
import java.io.InputStream;

public class FilterImageView extends LinearLayout
{
  static c[] zBY;
  private Activity czX;
  private int filterId;
  int[] zBP;
  private View zBQ;
  private ImageView zBR;
  private CropImageView zBS;
  Bitmap zBT;
  private MMHorList zBU;
  private a zBV;
  private Runnable zBW;
  private Runnable zBX;

  static
  {
    AppMethodBeat.i(107639);
    zBY = new c[] { new c(new FilterImageView.b("原图", "原圖", "Normal"), "icon.png", 0, 0, "MatteOrigin.jpg", 0), new c(new FilterImageView.b("LOMO", "LOMO", "LOMO"), "nuowei_mask%02d.jpg", 2, 1, "0004.jpg", 2), new c(new FilterImageView.b("麦田", "麥田", "Wheat"), "0062_%02d.jpg", 2, 2, "0062.jpg", 20), new c(new FilterImageView.b("玻璃镜", "玻璃鏡", "Glossy"), "habi_mask%02d.jpg", 1, 3, "0005.jpg", 4), new c(new FilterImageView.b("拍立得", "拍立得", "Polaroid"), "0063_%02d.jpg", 2, 4, "0063.jpg", 21), new c(new FilterImageView.b("湖水", "湖水", "Lake"), "0061_%02d.jpg", 1, 5, "0061.jpg", 19), new c(new FilterImageView.b("黄昏", "黃昏", "Twilight"), "0030_mask%01d.jpg", 1, 6, "0030.jpg", 7), new c(new FilterImageView.b("黑白", "黑白", "B&W"), "0065_%02d.jpg", 1, 7, "0065.jpg", 22), new c(new FilterImageView.b("铜版画", "銅版畫", "Aquatint"), "0032_mask%01d.jpg", 1, 8, "0032.jpg", 9), new c(new FilterImageView.b("圆珠笔", "圓珠筆", "Pen"), "0035_mask%01d.jpg", 1, 9, "0035.jpg", 18), new c(new FilterImageView.b("海报", "海報", "Poster"), "0036_mask%01d.jpg", 0, 10, "0036.jpg", 17), new c(new FilterImageView.b("素描", "素描", "Portrait"), "icon.jpg", 0, 11, "0040.jpg", 12) };
    AppMethodBeat.o(107639);
  }

  public FilterImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107629);
    this.filterId = 0;
    this.czX = ((Activity)paramContext);
    paramContext = View.inflate(this.czX, 2130969254, this);
    this.zBS = ((CropImageView)paramContext.findViewById(2131823169));
    this.zBR = ((ImageView)paramContext.findViewById(2131823172));
    this.zBQ = paramContext.findViewById(2131823171);
    this.zBS.setOnTouchListener(null);
    this.zBU = ((MMHorList)paramContext.findViewById(2131823173));
    this.zBV = new a();
    this.zBU.setAdapter(this.zBV);
    this.zBU.invalidate();
    this.zBU.setOnItemClickListener(new FilterImageView.1(this));
    AppMethodBeat.o(107629);
  }

  private boolean ay(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107637);
    boolean bool;
    if (paramInt2 == 0)
    {
      this.zBT.setPixels(this.zBP, 0, this.zBT.getWidth(), 0, 0, this.zBT.getWidth(), this.zBT.getHeight());
      this.zBS.invalidate();
      bool = true;
      AppMethodBeat.o(107637);
    }
    while (true)
    {
      return bool;
      int i = this.zBT.getWidth() * this.zBT.getHeight();
      ab.d("MicroMsg.FilterView", "len:" + i + "  maskCount:" + paramInt1);
      int[][] arrayOfInt = new int[paramInt1][i];
      for (int j = 0; ; j++)
      {
        Object localObject4;
        while (true)
        {
          if (j >= paramInt1)
            break label427;
          Object localObject1 = String.format(paramString, new Object[] { Integer.valueOf(j) });
          localObject2 = null;
          Object localObject3 = null;
          try
          {
            localObject1 = this.czX.getAssets().open("filter/".concat(String.valueOf(localObject1)));
            localObject3 = localObject1;
            localObject2 = localObject1;
            localObject4 = new byte[i];
            localObject3 = localObject1;
            localObject2 = localObject1;
            ((InputStream)localObject1).read((byte[])localObject4);
            localObject3 = localObject1;
            localObject2 = localObject1;
            localObject4 = d.bQ((byte[])localObject4);
            localObject3 = localObject1;
            localObject2 = localObject1;
            ((InputStream)localObject1).close();
            if (localObject1 != null)
              ((InputStream)localObject1).close();
            if (localObject4 == null)
            {
              bool = false;
              AppMethodBeat.o(107637);
              break;
            }
          }
          catch (Exception paramString)
          {
            localObject2 = localObject3;
            AppMethodBeat.o(107637);
            localObject2 = localObject3;
            throw paramString;
          }
          finally
          {
            if (localObject2 != null)
              ((InputStream)localObject2).close();
            AppMethodBeat.o(107637);
          }
        }
        Object localObject2 = Bitmap.createScaledBitmap((Bitmap)localObject4, this.zBT.getWidth(), this.zBT.getHeight(), true);
        if (localObject4 != localObject2)
        {
          ab.i("MicroMsg.FilterView", "recycle bitmap:%s", new Object[] { localObject4.toString() });
          ((Bitmap)localObject4).recycle();
        }
        if (localObject2 == null)
        {
          bool = false;
          AppMethodBeat.o(107637);
          break;
        }
        ((Bitmap)localObject2).getPixels(arrayOfInt[j], 0, ((Bitmap)localObject2).getWidth(), 0, 0, ((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight());
        ab.i("MicroMsg.FilterView", "recycle bitmap:%s", new Object[] { localObject2.toString() });
        ((Bitmap)localObject2).recycle();
      }
      label427: paramString = new PIntArray();
      ab.e("MicroMsg.FilterView", "src.len:" + this.zBP.length);
      for (j = 0; j < arrayOfInt.length; j++)
        ab.e("MicroMsg.FilterView", "mask[" + j + "].len:" + arrayOfInt[j].length);
      ab.e("MicroMsg.FilterView", "before filter");
      ImgFilter.FilterInt(paramInt2, this.zBP, arrayOfInt, paramInt1, this.zBT.getWidth(), this.zBT.getHeight(), paramString);
      ab.e("MicroMsg.FilterView", "after filter");
      this.zBT.setPixels(paramString.value, 0, this.zBT.getWidth(), 0, 0, this.zBT.getWidth(), this.zBT.getHeight());
      this.zBS.invalidate();
      bool = true;
      AppMethodBeat.o(107637);
    }
  }

  public final void dJL()
  {
    AppMethodBeat.i(107631);
    if (this.zBS != null)
    {
      this.zBS.setScaleType(ImageView.ScaleType.MATRIX);
      this.zBS.dJJ();
    }
    AppMethodBeat.o(107631);
  }

  public final void eH(String paramString, int paramInt)
  {
    AppMethodBeat.i(107635);
    ab.i("MicroMsg.FilterView", "filePath before fiterBmp:".concat(String.valueOf(paramString)));
    if ((this.zBT == null) || (this.zBT.isRecycled()))
      this.zBT = d.b(d.d(paramString, 480, 480, false), paramInt);
    ab.d("MicroMsg.FilterView", "filterBmp w:" + this.zBT.getWidth() + " h:" + this.zBT.getHeight());
    this.zBP = new int[this.zBT.getWidth() * this.zBT.getHeight()];
    this.zBT.getPixels(this.zBP, 0, this.zBT.getWidth(), 0, 0, this.zBT.getWidth(), this.zBT.getHeight());
    this.zBS.setImageBitmap(this.zBT);
    AppMethodBeat.o(107635);
  }

  public View getCropAreaView()
  {
    return this.zBQ;
  }

  public CropImageView getCropImageIV()
  {
    return this.zBS;
  }

  public Bitmap getFilterBmp()
  {
    return this.zBT;
  }

  public int getFilterId()
  {
    return this.filterId;
  }

  public void setCropMaskBackground(int paramInt)
  {
    AppMethodBeat.i(107634);
    if (this.zBR != null)
      this.zBR.setBackgroundResource(paramInt);
    AppMethodBeat.o(107634);
  }

  public void setCropMaskVisible(int paramInt)
  {
    AppMethodBeat.i(107633);
    if (this.zBR != null)
      this.zBR.setVisibility(paramInt);
    AppMethodBeat.o(107633);
  }

  public void setImage(Bitmap paramBitmap)
  {
    this.zBT = paramBitmap;
  }

  public void setLimitZoomIn(boolean paramBoolean)
  {
    AppMethodBeat.i(107630);
    if (this.zBS != null)
      this.zBS.setLimitZoomIn(paramBoolean);
    AppMethodBeat.o(107630);
  }

  public void setMatrix(Matrix paramMatrix)
  {
    AppMethodBeat.i(107632);
    if (this.zBS != null)
      this.zBS.setImageMatrix(paramMatrix);
    AppMethodBeat.o(107632);
  }

  public void setOnConfirmImp(Runnable paramRunnable)
  {
    this.zBW = paramRunnable;
  }

  public void setOnExitImp(Runnable paramRunnable)
  {
    this.zBX = paramRunnable;
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(107636);
    if (paramInt == 0)
    {
      this.zBV.notifyDataSetChanged();
      this.zBU.invalidate();
    }
    super.setVisibility(paramInt);
    AppMethodBeat.o(107636);
  }

  final class a extends BaseAdapter
  {
    int llU = 0;

    a()
    {
    }

    public final int getCount()
    {
      return FilterImageView.zBY.length;
    }

    public final Object getItem(int paramInt)
    {
      return FilterImageView.zBY[paramInt];
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(107628);
      FilterImageView.c localc = (FilterImageView.c)getItem(paramInt);
      Object localObject1;
      if ((paramView == null) || (!(paramView.getTag() instanceof FilterImageView.a.a)))
      {
        paramViewGroup = View.inflate(FilterImageView.b(FilterImageView.this), 2130969549, null);
        localObject1 = new FilterImageView.a.a(this);
        ((FilterImageView.a.a)localObject1).exj = ((TextView)paramViewGroup.findViewById(2131824018));
        ((FilterImageView.a.a)localObject1).zCa = ((ImageView)paramViewGroup.findViewById(2131824017));
        paramViewGroup.setTag(localObject1);
      }
      while (true)
      {
        Object localObject2 = ((FilterImageView.a.a)localObject1).exj;
        FilterImageView.b localb = localc.zCf;
        paramView = aa.dor();
        if (paramView.equals("zh_CN"))
        {
          paramView = localb.yVk;
          label120: ((TextView)localObject2).setText(paramView);
        }
        try
        {
          localObject2 = FilterImageView.b(FilterImageView.this).getAssets();
          paramView = new java/lang/StringBuilder;
          paramView.<init>("filter/");
          paramView = ((AssetManager)localObject2).open(localc.cIY);
          ((FilterImageView.a.a)localObject1).zCb = d.decodeStream(paramView);
          paramView.close();
          ((FilterImageView.a.a)localObject1).zCa.setImageBitmap(((FilterImageView.a.a)localObject1).zCb);
          paramViewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
          if (paramInt == this.llU)
          {
            paramViewGroup.findViewById(2131824017).setBackgroundResource(2130838045);
            AppMethodBeat.o(107628);
            return paramViewGroup;
            localObject2 = (FilterImageView.a.a)paramView.getTag();
            localObject1 = localObject2;
            paramViewGroup = paramView;
            if (((FilterImageView.a.a)localObject2).zCb == null)
              continue;
            ab.i("MicroMsg.FilterView", "recycle bitmap:%s", new Object[] { ((FilterImageView.a.a)localObject2).zCb.toString() });
            ((FilterImageView.a.a)localObject2).zCb.recycle();
            localObject1 = localObject2;
            paramViewGroup = paramView;
            continue;
            if ((paramView.equals("zh_TW")) || (paramView.equals("zh_HK")))
            {
              paramView = localb.zCd;
              break label120;
            }
            paramView = localb.zCe;
          }
        }
        catch (IOException paramView)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.FilterView", paramView, "", new Object[0]);
            continue;
            paramViewGroup.findViewById(2131824017).setBackgroundResource(2130838046);
          }
        }
      }
    }
  }

  static final class c
  {
    String cIY;
    FilterImageView.b zCf;
    String zCg;
    int zCh;
    int zCi;
    int zCj;

    c(FilterImageView.b paramb, String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3)
    {
      this.zCf = paramb;
      this.zCg = paramString1;
      this.zCh = paramInt1;
      this.zCi = paramInt2;
      this.cIY = paramString2;
      this.zCj = paramInt3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.FilterImageView
 * JD-Core Version:    0.6.2
 */