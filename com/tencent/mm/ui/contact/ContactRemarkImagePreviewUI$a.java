package com.tencent.mm.ui.contact;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class ContactRemarkImagePreviewUI$a extends BaseAdapter
{
  String imagePath;

  ContactRemarkImagePreviewUI$a(ContactRemarkImagePreviewUI paramContactRemarkImagePreviewUI)
  {
  }

  public final int getCount()
  {
    return 1;
  }

  public final Object getItem(int paramInt)
  {
    return this.imagePath;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(33618);
    paramViewGroup = View.inflate(this.zlA, 2130969234, null);
    MultiTouchImageView localMultiTouchImageView = (MultiTouchImageView)paramViewGroup.findViewById(2131820629);
    paramViewGroup.setLayoutParams(new Gallery.LayoutParams(-1, -1));
    localMultiTouchImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    paramView = BackwardSupportUtil.b.i(this.imagePath, a.getDensity(this.zlA));
    int i;
    Matrix localMatrix;
    if (paramView != null)
    {
      i = ContactRemarkImagePreviewUI.e(this.zlA).getWidth();
      paramInt = ContactRemarkImagePreviewUI.e(this.zlA).getHeight();
      localMatrix = new Matrix();
      localMatrix.reset();
      f1 = paramView.getWidth() / paramView.getHeight();
      f2 = paramView.getHeight() / paramView.getWidth();
      ab.v("MicroMsg.ImagePreviewUI", "whDiv is " + f1 + " hwDiv is " + f2);
      if ((f2 < 2.0F) || (paramView.getHeight() < 480))
        break label312;
      f1 = paramView.getWidth() / i;
      f2 = i / paramView.getWidth();
      if (f1 <= 1.0D)
        break label284;
      localMatrix.postScale(f2, f2);
      paramView.getHeight();
      localMatrix.postTranslate((i - f2 * paramView.getWidth()) / 2.0F, 0.0F);
    }
    while (true)
    {
      localMultiTouchImageView.setImageMatrix(localMatrix);
      localMultiTouchImageView.bW(paramView.getWidth(), paramView.getHeight());
      localMultiTouchImageView.setImageBitmap(paramView);
      AppMethodBeat.o(33618);
      return paramViewGroup;
      label284: localMatrix.postScale(1.0F, 1.0F);
      localMatrix.postTranslate((i - paramView.getWidth()) / 2, 0.0F);
      continue;
      label312: if ((f1 < 2.0F) || (paramView.getWidth() < 480))
        break;
      f2 = paramView.getHeight() / 480.0F;
      f1 = 480.0F / paramView.getHeight();
      if (f2 > 1.0D)
      {
        localMatrix.postScale(f2, f1);
        localMatrix.postTranslate(0.0F, (paramInt - 480) / 2);
      }
      else
      {
        localMatrix.postScale(1.0F, 1.0F);
        f1 = (paramInt - paramView.getHeight()) / 2;
        ab.d("MicroMsg.ImagePreviewUI", " offsety ".concat(String.valueOf(f1)));
        localMatrix.postTranslate(0.0F, f1);
      }
    }
    float f2 = i / paramView.getWidth();
    float f1 = paramInt / paramView.getHeight();
    label464: float f3;
    if (f2 < f1)
    {
      f1 = f2;
      f2 = paramView.getWidth() / i;
      f3 = paramView.getHeight() / paramInt;
      if (f2 <= f3)
        break label550;
      label493: if (f2 <= 1.0D)
        break label557;
      localMatrix.postScale(f1, f1);
    }
    while (true)
    {
      localMatrix.postTranslate((i - paramView.getWidth() * f1) / 2.0F, (paramInt - f1 * paramView.getHeight()) / 2.0F);
      break;
      break label464;
      label550: f2 = f3;
      break label493;
      label557: f1 = 1.0F;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI.a
 * JD-Core Version:    0.6.2
 */