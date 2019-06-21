package android.support.v7.widget;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.v4.a.a.f;
import android.util.AttributeSet;
import android.widget.ProgressBar;

class l
{
  private static final int[] aaV = { 16843067, 16843068 };
  private final ProgressBar afQ;
  Bitmap afR;

  l(ProgressBar paramProgressBar)
  {
    this.afQ = paramProgressBar;
  }

  private Drawable b(Drawable paramDrawable, boolean paramBoolean)
  {
    int i = 0;
    Object localObject1;
    Object localObject2;
    if ((paramDrawable instanceof f))
    {
      localObject1 = ((f)paramDrawable).dC();
      localObject2 = paramDrawable;
      if (localObject1 != null)
      {
        localObject2 = b((Drawable)localObject1, paramBoolean);
        ((f)paramDrawable).h((Drawable)localObject2);
        localObject2 = paramDrawable;
      }
    }
    while (true)
    {
      return localObject2;
      if ((paramDrawable instanceof LayerDrawable))
      {
        paramDrawable = (LayerDrawable)paramDrawable;
        int j = paramDrawable.getNumberOfLayers();
        localObject2 = new Drawable[j];
        int k = 0;
        if (k < j)
        {
          int m = paramDrawable.getId(k);
          localObject1 = paramDrawable.getDrawable(k);
          if ((m == 16908301) || (m == 16908303));
          for (paramBoolean = true; ; paramBoolean = false)
          {
            localObject2[k] = b((Drawable)localObject1, paramBoolean);
            k++;
            break;
          }
        }
        localObject2 = new LayerDrawable((Drawable[])localObject2);
        for (k = i; k < j; k++)
          ((LayerDrawable)localObject2).setId(k, paramDrawable.getId(k));
      }
      else
      {
        localObject2 = paramDrawable;
        if ((paramDrawable instanceof BitmapDrawable))
        {
          paramDrawable = (BitmapDrawable)paramDrawable;
          localObject1 = paramDrawable.getBitmap();
          if (this.afR == null)
            this.afR = ((Bitmap)localObject1);
          localObject2 = new ShapeDrawable(new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null));
          localObject1 = new BitmapShader((Bitmap)localObject1, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
          ((ShapeDrawable)localObject2).getPaint().setShader((Shader)localObject1);
          ((ShapeDrawable)localObject2).getPaint().setColorFilter(paramDrawable.getPaint().getColorFilter());
          if (paramBoolean)
            localObject2 = new ClipDrawable((Drawable)localObject2, 3, 1);
        }
      }
    }
  }

  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    bc localbc = bc.a(this.afQ.getContext(), paramAttributeSet, aaV, paramInt, 0);
    Drawable localDrawable = localbc.cW(0);
    if (localDrawable != null)
    {
      ProgressBar localProgressBar = this.afQ;
      paramAttributeSet = localDrawable;
      if ((localDrawable instanceof AnimationDrawable))
      {
        AnimationDrawable localAnimationDrawable = (AnimationDrawable)localDrawable;
        int i = localAnimationDrawable.getNumberOfFrames();
        paramAttributeSet = new AnimationDrawable();
        paramAttributeSet.setOneShot(localAnimationDrawable.isOneShot());
        for (paramInt = 0; paramInt < i; paramInt++)
        {
          localDrawable = b(localAnimationDrawable.getFrame(paramInt), true);
          localDrawable.setLevel(10000);
          paramAttributeSet.addFrame(localDrawable, localAnimationDrawable.getDuration(paramInt));
        }
        paramAttributeSet.setLevel(10000);
      }
      localProgressBar.setIndeterminateDrawable(paramAttributeSet);
    }
    paramAttributeSet = localbc.cW(1);
    if (paramAttributeSet != null)
      this.afQ.setProgressDrawable(b(paramAttributeSet, false));
    localbc.atG.recycle();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.l
 * JD-Core Version:    0.6.2
 */