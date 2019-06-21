package com.tencent.mm.d.a;

import android.text.TextUtils;
import com.eclipsesource.v8.V8Context;
import com.eclipsesource.v8.V8Object;

public abstract class n
{
  private final String mKey;

  public n()
  {
    this("");
  }

  public n(String paramString)
  {
    this.mKey = paramString;
  }

  final n a(l paraml)
  {
    if (TextUtils.isEmpty(this.mKey))
      a(paraml, paraml.CB().getGlobalObject());
    while (true)
    {
      return this;
      V8Object localV8Object = paraml.CB().newV8Object();
      paraml.CB().add(this.mKey, localV8Object);
      a(paraml, localV8Object);
      localV8Object.release();
    }
  }

  protected abstract void a(l paraml, V8Object paramV8Object);

  abstract void cleanup();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.n
 * JD-Core Version:    0.6.2
 */