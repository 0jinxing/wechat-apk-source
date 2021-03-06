package com.tencent.map.lib.gl.model;

import android.graphics.Bitmap;
import android.opengl.GLU;
import android.view.MotionEvent;
import com.tencent.map.lib.basemap.data.DoublePoint;
import com.tencent.map.lib.gl.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ex;
import com.tencent.tencentmap.mapsdk.maps.a.ey;
import com.tencent.tencentmap.mapsdk.maps.a.fb;
import com.tencent.tencentmap.mapsdk.maps.a.ff;
import javax.microedition.khronos.opengles.GL10;

public class a extends b
  implements ex
{
  public static final int ELEMENT_ANIMATOR_ALPHA = 1;
  public static final int ELEMENT_ANIMATOR_ROTATE = 4;
  public static final int ELEMENT_ANIMATOR_SCALE = 2;
  public static final int ELEMENT_ANIMATOR_TRANSLATE = 3;
  public static final int STATE_DISABLE = 2;
  public static final int STATE_FOCUS = 1;
  public static final int STATE_NORMAL = 0;
  protected float alpha = 1.0F;
  private a.a mAdapter;
  private int mState;
  private a.b mTextureListener;
  protected float rotate = 0.0F;
  protected float scaleX = 1.0F;
  protected float scaleY = 1.0F;
  protected float translateX = 0.0F;
  protected float translateY = 0.0F;

  private void drawTexture(GL10 paramGL10, com.tencent.map.lib.gl.b paramb)
  {
    AppMethodBeat.i(98141);
    String str = getIdByState();
    int i = paramb.a(str);
    int j = i;
    if (i == 0)
    {
      Bitmap localBitmap1 = this.mAdapter.getTextureBm(this.mState);
      Bitmap localBitmap2 = c.a(localBitmap1);
      j = c.a(paramGL10, localBitmap2);
      if (localBitmap2 != localBitmap1)
        localBitmap2.recycle();
      if (this.mTextureListener != null)
        this.mTextureListener.a(localBitmap1);
      paramb.a(str, j);
    }
    if (j != 0)
      super.drawWithTexture(paramGL10, j);
    AppMethodBeat.o(98141);
  }

  private String getIdByState()
  {
    AppMethodBeat.i(98140);
    String str = this.mAdapter.getTextureUID() + "_" + this.mState;
    AppMethodBeat.o(98140);
    return str;
  }

  private void performDraw(GL10 paramGL10, com.tencent.map.lib.gl.b paramb)
  {
    AppMethodBeat.i(98138);
    paramGL10.glPushMatrix();
    if (prepareDraw(paramGL10))
    {
      if (!this.mAdapter.hasTexture())
        break label49;
      drawTexture(paramGL10, paramb);
    }
    while (true)
    {
      paramGL10.glPopMatrix();
      AppMethodBeat.o(98138);
      return;
      label49: super.drawWithTexture(paramGL10, 0);
    }
  }

  public ey animator(int paramInt, Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(98142);
    switch (paramInt)
    {
    default:
      paramObject1 = null;
      AppMethodBeat.o(98142);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return paramObject1;
      paramObject1 = ff.a(this, 1, new double[] { ((Number)paramObject1).doubleValue(), ((Number)paramObject2).doubleValue() });
      AppMethodBeat.o(98142);
      continue;
      paramObject1 = ff.a(this, 2, new fb(), new Object[] { paramObject1, paramObject2 });
      AppMethodBeat.o(98142);
      continue;
      paramObject1 = ff.a(this, 3, new fb(), new Object[] { paramObject1, paramObject2 });
      AppMethodBeat.o(98142);
      continue;
      paramObject1 = ff.a(this, 4, new double[] { ((Number)paramObject1).doubleValue(), ((Number)paramObject2).doubleValue() });
      AppMethodBeat.o(98142);
    }
  }

  public void draw(GL10 paramGL10, com.tencent.map.lib.gl.b paramb)
  {
    try
    {
      AppMethodBeat.i(98136);
      if (this.mAdapter == null)
      {
        paramGL10 = new java/lang/RuntimeException;
        paramGL10.<init>("please setAdapter first");
        AppMethodBeat.o(98136);
        throw paramGL10;
      }
    }
    finally
    {
    }
    paramGL10.glColor4f(this.alpha, this.alpha, this.alpha, this.alpha);
    paramGL10.glScalef(this.scaleX, this.scaleY, 1.0F);
    paramGL10.glTranslatef(this.translateX, this.translateY, 0.0F);
    paramGL10.glRotatef(this.rotate, 0.0F, 0.0F, 1.0F);
    performDraw(paramGL10, paramb);
    paramGL10.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    AppMethodBeat.o(98136);
  }

  public void drawWithOrthogo(GL10 paramGL10, com.tencent.map.lib.gl.b paramb, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(98139);
    paramGL10.glMatrixMode(5889);
    paramGL10.glPushMatrix();
    paramGL10.glLoadIdentity();
    GLU.gluOrtho2D(paramGL10, 0.0F, paramInt1, 0.0F, paramInt2);
    draw(paramGL10, paramb);
    paramGL10.glPopMatrix();
    paramGL10.glMatrixMode(5888);
    AppMethodBeat.o(98139);
  }

  public int getState()
  {
    return this.mState;
  }

  public boolean onTap(float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  protected boolean prepareDraw(GL10 paramGL10)
  {
    return true;
  }

  public void rebuild(float[] paramArrayOfFloat1, short[] paramArrayOfShort, float[] paramArrayOfFloat2)
  {
    try
    {
      AppMethodBeat.i(98137);
      setVertices(paramArrayOfFloat1);
      setIndices(paramArrayOfShort);
      setTextureCoordinates(paramArrayOfFloat2);
      AppMethodBeat.o(98137);
      return;
    }
    finally
    {
      paramArrayOfFloat1 = finally;
    }
    throw paramArrayOfFloat1;
  }

  public void setAdapter(a.a parama)
  {
    try
    {
      this.mAdapter = parama;
      return;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  public void setPropertyValue(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(98143);
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(98143);
      while (true)
      {
        return;
        this.alpha = ((Number)paramObject).floatValue();
        AppMethodBeat.o(98143);
        continue;
        paramObject = (DoublePoint)paramObject;
        this.scaleX = ((float)paramObject.x);
        this.scaleY = ((float)paramObject.y);
        AppMethodBeat.o(98143);
        continue;
        paramObject = (DoublePoint)paramObject;
        this.translateX = ((float)paramObject.x);
        this.translateY = ((float)paramObject.y);
        AppMethodBeat.o(98143);
      }
      this.rotate = ((Number)paramObject).floatValue();
    }
  }

  public void setState(int paramInt)
  {
    this.mState = paramInt;
    this.alpha = 1.0F;
    this.scaleX = 1.0F;
    this.scaleY = 1.0F;
    this.translateX = 0.0F;
    this.translateY = 0.0F;
  }

  public void setTextureListener(a.b paramb)
  {
    this.mTextureListener = paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.gl.model.a
 * JD-Core Version:    0.6.2
 */