package com.tencent.mm.plugin.nfc.b;

import android.nfc.Tag;

public abstract class b
{
  protected Tag oTm;
  public byte[] oTn = null;

  public boolean a(Tag paramTag)
  {
    this.oTm = paramTag;
    if (paramTag != null)
      this.oTn = paramTag.getId();
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nfc.b.b
 * JD-Core Version:    0.6.2
 */