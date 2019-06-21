package com.tencent.map.lib.gl.model;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GLIcon extends a
  implements a.a
{
  public static final int BOTTOM = 16;
  public static final int CENTER = 1;
  public static final int LEFT = 4096;
  public static final int RIGHT = 65536;
  public static final int TOP = 256;
  private float mAlpha;
  private float mAnchorPointX;
  private float mAnchorPointY;
  private boolean mAvoidAnno;
  private float mBottomPartLen;
  private RectF mBounds;
  private int mCurrentState;
  public int mDisplayId;
  private boolean mFastLoad;
  private boolean mFixPos;
  private boolean mFlat;
  private boolean mHasIconChanged;
  private String mIconName;
  public Bitmap[] mIcons;
  private boolean mIsDirty;
  private int mLastIconHei;
  private String mLastIconName;
  private int mLastIconWid;
  private float mLeftPartLen;
  private int mOffsetX;
  private int mOffsetY;
  public double mPositionX;
  public double mPositionY;
  private float mRightPartLen;
  private int mRotateAngle;
  private float mScaleX;
  private float mScaleY;
  private float mTopPartLen;

  public GLIcon(String paramString, GeoPoint paramGeoPoint, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, Bitmap[] paramArrayOfBitmap)
  {
    AppMethodBeat.i(98124);
    this.mCurrentState = 0;
    this.mAnchorPointX = 0.5F;
    this.mAnchorPointY = 0.5F;
    this.mIsDirty = false;
    this.mLeftPartLen = 0.0F;
    this.mRightPartLen = 0.0F;
    this.mTopPartLen = 0.0F;
    this.mBottomPartLen = 0.0F;
    this.mAlpha = 1.0F;
    this.mRotateAngle = 0;
    this.mScaleX = 1.0F;
    this.mScaleY = 1.0F;
    this.mFixPos = false;
    this.mFlat = true;
    this.mHasIconChanged = false;
    this.mFastLoad = false;
    this.mAvoidAnno = false;
    setAdapter(this);
    this.mAnchorPointX = paramFloat1;
    this.mAnchorPointY = paramFloat2;
    this.mOffsetX = paramInt1;
    this.mOffsetY = paramInt2;
    if (paramGeoPoint != null)
    {
      this.mPositionX = (paramGeoPoint.getLongitudeE6() / 1000000.0D);
      this.mPositionY = (paramGeoPoint.getLatitudeE6() / 1000000.0D);
    }
    update(paramString, paramArrayOfBitmap);
    AppMethodBeat.o(98124);
  }

  public GLIcon(String paramString, GeoPoint paramGeoPoint, float paramFloat1, float paramFloat2, Bitmap[] paramArrayOfBitmap)
  {
    this(paramString, paramGeoPoint, paramFloat1, paramFloat2, 0, 0, paramArrayOfBitmap);
  }

  public GLIcon(String paramString, GeoPoint paramGeoPoint, Bitmap[] paramArrayOfBitmap)
  {
    this(paramString, paramGeoPoint, 0.5F, 0.5F, 0, 0, paramArrayOfBitmap);
  }

  private Bitmap getBmByState(int paramInt)
  {
    Bitmap localBitmap;
    if (this.mIcons == null)
      localBitmap = null;
    while (true)
    {
      return localBitmap;
      if ((paramInt < 0) || (paramInt >= this.mIcons.length))
        localBitmap = this.mIcons[0];
      else
        localBitmap = this.mIcons[paramInt];
    }
  }

  protected void build(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(98125);
    if ((this.mLastIconWid == paramInt1) && (this.mLastIconHei == paramInt2))
      AppMethodBeat.o(98125);
    while (true)
    {
      return;
      this.mLastIconWid = paramInt1;
      this.mLastIconHei = paramInt2;
      float f1 = this.mOffsetX / paramInt1;
      float f2 = this.mOffsetY / paramInt2;
      this.mBounds = new RectF(f1, -f2, 0.0F, 0.0F);
      this.mAnchorPointX -= f1;
      this.mAnchorPointY -= f2;
      this.mLeftPartLen = (-this.mLastIconWid * this.mAnchorPointX);
      this.mRightPartLen = (this.mLastIconWid + this.mLeftPartLen);
      this.mTopPartLen = (this.mLastIconHei * this.mAnchorPointY);
      this.mBottomPartLen = (this.mTopPartLen - this.mLastIconHei);
      AppMethodBeat.o(98125);
    }
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    if (!(paramObject instanceof GLIcon));
    while (true)
    {
      return bool;
      if (this.mDisplayId == ((GLIcon)paramObject).mDisplayId)
        bool = true;
    }
  }

  public float getAlpha()
  {
    return this.mAlpha;
  }

  public float getAnchorY()
  {
    return this.mAnchorPointY;
  }

  public float getAnchroX()
  {
    return this.mAnchorPointX;
  }

  public float getBottom()
  {
    return this.mBottomPartLen;
  }

  public RectF getBounds()
  {
    AppMethodBeat.i(98134);
    RectF localRectF = new RectF(this.mBounds);
    AppMethodBeat.o(98134);
    return localRectF;
  }

  public String getIconName()
  {
    return this.mIconName;
  }

  public String getLastName()
  {
    return this.mLastIconName;
  }

  public float getLeft()
  {
    return this.mLeftPartLen;
  }

  public float getRight()
  {
    return this.mRightPartLen;
  }

  public float getRotateAngle()
  {
    return this.mRotateAngle;
  }

  public float getScaleX()
  {
    return this.mScaleX;
  }

  public float getScaleY()
  {
    return this.mScaleY;
  }

  public Bitmap getTextureBm(int paramInt)
  {
    try
    {
      AppMethodBeat.i(98135);
      Bitmap localBitmap = getBmByState(getState());
      AppMethodBeat.o(98135);
      return localBitmap;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public String getTextureUID()
  {
    return this.mIconName;
  }

  public float getTop()
  {
    return this.mTopPartLen;
  }

  public boolean hasTexture()
  {
    return true;
  }

  public boolean isAvoidAnno()
  {
    return this.mAvoidAnno;
  }

  public boolean isDirty()
  {
    return this.mIsDirty;
  }

  public boolean isFastLoad()
  {
    return this.mFastLoad;
  }

  public boolean isFixPos()
  {
    return this.mFixPos;
  }

  public boolean isFlat()
  {
    return this.mFlat;
  }

  public boolean isIconChanged()
  {
    return this.mHasIconChanged;
  }

  public void setAlpha(float paramFloat)
  {
    AppMethodBeat.i(98130);
    this.mAlpha = paramFloat;
    setDirty(true);
    AppMethodBeat.o(98130);
  }

  public void setAnchor(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(98129);
    this.mAnchorPointX = paramFloat1;
    this.mAnchorPointY = paramFloat2;
    build(this.mLastIconWid, this.mLastIconHei);
    setDirty(true);
    AppMethodBeat.o(98129);
  }

  public void setAvoidAnno(boolean paramBoolean)
  {
    this.mAvoidAnno = paramBoolean;
  }

  public void setDirty(boolean paramBoolean)
  {
    this.mIsDirty = paramBoolean;
  }

  public void setFastLoad(boolean paramBoolean)
  {
    this.mFastLoad = paramBoolean;
  }

  public void setFixPos(boolean paramBoolean)
  {
    this.mFixPos = paramBoolean;
  }

  public void setFlat(boolean paramBoolean)
  {
    this.mFlat = paramBoolean;
  }

  public void setIconChanged(boolean paramBoolean)
  {
    this.mHasIconChanged = paramBoolean;
    if (!paramBoolean)
      this.mLastIconName = this.mIconName;
  }

  public void setOffset(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(98126);
    this.mOffsetX = paramInt1;
    this.mOffsetY = paramInt2;
    setDirty(true);
    AppMethodBeat.o(98126);
  }

  public void setPosition(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(98127);
    if (paramGeoPoint != null)
      if (!this.mFixPos)
        break label51;
    label51: for (double d = 1.0D; ; d = 1000000.0D)
    {
      this.mPositionX = (paramGeoPoint.getLongitudeE6() / d);
      this.mPositionY = (paramGeoPoint.getLatitudeE6() / d);
      setDirty(true);
      AppMethodBeat.o(98127);
      return;
    }
  }

  public void setRotateAngle(int paramInt)
  {
    AppMethodBeat.i(98132);
    this.mRotateAngle = paramInt;
    setDirty(true);
    AppMethodBeat.o(98132);
  }

  public void setScale(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(98131);
    this.mScaleX = paramFloat1;
    this.mScaleY = paramFloat2;
    setDirty(true);
    AppMethodBeat.o(98131);
  }

  public void setState(int paramInt)
  {
    try
    {
      AppMethodBeat.i(98133);
      this.mCurrentState = paramInt;
      setDirty(true);
      setIconChanged(true);
      Bitmap localBitmap = getBmByState(paramInt);
      if (localBitmap != null)
      {
        int i = localBitmap.getWidth();
        int j = localBitmap.getHeight();
        if ((this.mLastIconWid != i) || (this.mLastIconHei != j))
          build(i, j);
      }
      super.setState(paramInt);
      AppMethodBeat.o(98133);
      return;
    }
    finally
    {
    }
  }

  public final void update(String paramString, Bitmap[] paramArrayOfBitmap)
  {
    try
    {
      AppMethodBeat.i(98128);
      if (paramArrayOfBitmap == null)
        AppMethodBeat.o(98128);
      while (true)
      {
        return;
        setDirty(true);
        setIconChanged(true);
        this.mIconName = paramString;
        this.mIcons = paramArrayOfBitmap;
        if ((this.mCurrentState < 0) || (this.mCurrentState >= paramArrayOfBitmap.length))
          this.mCurrentState = 0;
        if (paramArrayOfBitmap[this.mCurrentState] != null)
          build(paramArrayOfBitmap[this.mCurrentState].getWidth(), paramArrayOfBitmap[this.mCurrentState].getHeight());
        AppMethodBeat.o(98128);
      }
    }
    finally
    {
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.gl.model.GLIcon
 * JD-Core Version:    0.6.2
 */