package com.bumptech.glide;

import com.bumptech.glide.f.b.a;
import com.bumptech.glide.f.b.c;

public abstract class k<CHILD extends k<CHILD, TranscodeType>, TranscodeType>
  implements Cloneable
{
  c<? super TranscodeType> axu = a.oh();

  public final CHILD lJ()
  {
    try
    {
      k localk = (k)super.clone();
      return localk;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new RuntimeException(localCloneNotSupportedException);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.k
 * JD-Core Version:    0.6.2
 */