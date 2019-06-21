package com.tencent.mm.loader.h;

import a.l;
import a.v;
import android.graphics.Bitmap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/model/LoadResult;", "R", "", "()V", "status", "", "from", "value", "(IILjava/lang/Object;)V", "data", "", "contentType", "", "([BLjava/lang/String;)V", "([BILjava/lang/String;)V", "getContentType", "()Ljava/lang/String;", "setContentType", "(Ljava/lang/String;)V", "getData", "()[B", "setData", "([B)V", "getFrom", "()I", "setFrom", "(I)V", "getStatus", "setStatus", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "isValid", "", "(Ljava/lang/Object;)Lcom/tencent/mm/loader/model/LoadResult;", "Companion", "libimageloader_release"})
public final class c<R>
{
  private static final int STATUS_DEFAULT = -1;
  private static final int STATUS_OK = 0;
  private static final int eRL = 1;
  private static final int eRM = 2;
  private static final int eRN = 3;
  private static final int eRO = 4;
  private static final int eRP = 0;
  private static final int eRQ = 1;
  private static final int eRR = 2;
  public static final c.a eRS = new c.a((byte)0);
  public int from;
  public int status;
  public R value;

  public c()
  {
    this.status = STATUS_DEFAULT;
  }

  public c(int paramInt1, int paramInt2, R paramR)
  {
    this.status = paramInt1;
    this.from = paramInt2;
    this.value = paramR;
  }

  public final boolean isValid()
  {
    boolean bool;
    if (this.value == null)
      bool = false;
    while (true)
    {
      return bool;
      if ((this.value instanceof Bitmap))
      {
        Object localObject = this.value;
        if (localObject == null)
          throw new v("null cannot be cast to non-null type android.graphics.Bitmap");
        if (!((Bitmap)localObject).isRecycled())
          bool = true;
        else
          bool = false;
      }
      else
      {
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.h.c
 * JD-Core Version:    0.6.2
 */