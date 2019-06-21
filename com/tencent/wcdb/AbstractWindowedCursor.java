package com.tencent.wcdb;

import android.database.CharArrayBuffer;

public abstract class AbstractWindowedCursor extends AbstractCursor
{
  protected CursorWindow mWindow;

  protected void checkPosition()
  {
    super.checkPosition();
    if (this.mWindow == null)
      throw new StaleDataException("Attempting to access a closed CursorWindow.Most probable cause: cursor is deactivated prior to calling this method.");
  }

  protected void clearOrCreateWindow(String paramString)
  {
    if (this.mWindow == null)
      this.mWindow = new CursorWindow(paramString);
    while (true)
    {
      return;
      this.mWindow.clear();
    }
  }

  protected void closeWindow()
  {
    if (this.mWindow != null)
    {
      this.mWindow.close();
      this.mWindow = null;
    }
  }

  public void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
    checkPosition();
    this.mWindow.copyStringToBuffer(this.mPos, paramInt, paramCharArrayBuffer);
  }

  public byte[] getBlob(int paramInt)
  {
    checkPosition();
    return this.mWindow.getBlob(this.mPos, paramInt);
  }

  public double getDouble(int paramInt)
  {
    checkPosition();
    return this.mWindow.getDouble(this.mPos, paramInt);
  }

  public float getFloat(int paramInt)
  {
    checkPosition();
    return this.mWindow.getFloat(this.mPos, paramInt);
  }

  public int getInt(int paramInt)
  {
    checkPosition();
    return this.mWindow.getInt(this.mPos, paramInt);
  }

  public long getLong(int paramInt)
  {
    checkPosition();
    return this.mWindow.getLong(this.mPos, paramInt);
  }

  public short getShort(int paramInt)
  {
    checkPosition();
    return this.mWindow.getShort(this.mPos, paramInt);
  }

  public String getString(int paramInt)
  {
    checkPosition();
    return this.mWindow.getString(this.mPos, paramInt);
  }

  public int getType(int paramInt)
  {
    checkPosition();
    return this.mWindow.getType(this.mPos, paramInt);
  }

  public CursorWindow getWindow()
  {
    return this.mWindow;
  }

  public boolean hasWindow()
  {
    if (this.mWindow != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  @Deprecated
  public boolean isBlob(int paramInt)
  {
    if (getType(paramInt) == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  @Deprecated
  public boolean isFloat(int paramInt)
  {
    if (getType(paramInt) == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  @Deprecated
  public boolean isLong(int paramInt)
  {
    boolean bool = true;
    if (getType(paramInt) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public boolean isNull(int paramInt)
  {
    checkPosition();
    if (this.mWindow.getType(this.mPos, paramInt) == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  @Deprecated
  public boolean isString(int paramInt)
  {
    if (getType(paramInt) == 3);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected void onDeactivateOrClose()
  {
    super.onDeactivateOrClose();
    closeWindow();
  }

  public void setWindow(CursorWindow paramCursorWindow)
  {
    if (paramCursorWindow != this.mWindow)
    {
      closeWindow();
      this.mWindow = paramCursorWindow;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.AbstractWindowedCursor
 * JD-Core Version:    0.6.2
 */