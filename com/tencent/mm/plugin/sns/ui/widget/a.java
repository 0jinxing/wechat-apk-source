package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.util.DisplayMetrics;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends Animation
{
  private final float ccw;
  private final float ccx;
  private Context context;
  private final float rMv;
  private final float rMw;
  private final float rMx;
  private final boolean rMy;
  private Camera rMz;
  private float scale;

  public a(Context paramContext, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean)
  {
    AppMethodBeat.i(40435);
    this.scale = 1.0F;
    this.context = paramContext;
    this.rMv = paramFloat1;
    this.rMw = paramFloat2;
    this.ccw = paramFloat3;
    this.ccx = paramFloat4;
    this.rMx = 150.0F;
    this.rMy = paramBoolean;
    this.scale = paramContext.getResources().getDisplayMetrics().density;
    AppMethodBeat.o(40435);
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    AppMethodBeat.i(40437);
    float f1 = this.rMv;
    float f2 = this.rMw;
    float f3 = this.rMv;
    float f4 = this.ccw;
    float f5 = this.ccx;
    Object localObject = this.rMz;
    paramTransformation = paramTransformation.getMatrix();
    ((Camera)localObject).save();
    if (this.rMy)
      ((Camera)localObject).translate(0.0F, 0.0F, this.rMx * paramFloat);
    while (true)
    {
      ((Camera)localObject).rotateY(f1 + (f2 - f3) * paramFloat);
      ((Camera)localObject).getMatrix(paramTransformation);
      ((Camera)localObject).restore();
      localObject = new float[9];
      Object tmp103_101 = localObject;
      tmp103_101[0] = 0.0F;
      Object tmp107_103 = tmp103_101;
      tmp107_103[1] = 0.0F;
      Object tmp111_107 = tmp107_103;
      tmp111_107[2] = 0.0F;
      Object tmp115_111 = tmp111_107;
      tmp115_111[3] = 0.0F;
      Object tmp119_115 = tmp115_111;
      tmp119_115[4] = 0.0F;
      Object tmp123_119 = tmp119_115;
      tmp123_119[5] = 0.0F;
      Object tmp127_123 = tmp123_119;
      tmp127_123[6] = 0.0F;
      Object tmp132_127 = tmp127_123;
      tmp132_127[7] = 0.0F;
      Object tmp137_132 = tmp132_127;
      tmp137_132[8] = 0.0F;
      tmp137_132;
      paramTransformation.getValues((float[])localObject);
      localObject[6] /= this.scale;
      paramTransformation.setValues((float[])localObject);
      paramTransformation.preTranslate(-f4, -f5);
      paramTransformation.postTranslate(f4, f5);
      AppMethodBeat.o(40437);
      return;
      ((Camera)localObject).translate(0.0F, 0.0F, this.rMx * (1.0F - paramFloat));
    }
  }

  public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(40436);
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
    this.rMz = new Camera();
    AppMethodBeat.o(40436);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.a
 * JD-Core Version:    0.6.2
 */