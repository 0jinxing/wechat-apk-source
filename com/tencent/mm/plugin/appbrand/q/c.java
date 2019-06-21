package com.tencent.mm.plugin.appbrand.q;

import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public abstract class c<_Model extends com.tencent.mm.sdk.e.c,  extends b> extends j<_Model>
{
  public c(e parame, c.a parama, String paramString, String[] paramArrayOfString)
  {
    super(parame, parama, paramString, paramArrayOfString);
  }

  public final boolean a(_Model param_Model, boolean paramBoolean)
  {
    super.a(param_Model, paramBoolean);
    return b(param_Model, new String[0]);
  }

  public final boolean a(_Model param_Model, boolean paramBoolean, String[] paramArrayOfString)
  {
    String[] arrayOfString;
    if (paramArrayOfString != null)
    {
      arrayOfString = paramArrayOfString;
      if (paramArrayOfString.length != 0);
    }
    else
    {
      arrayOfString = ((b)param_Model).getKeys();
    }
    return super.a(param_Model, paramBoolean, arrayOfString);
  }

  public final boolean b(_Model param_Model, boolean paramBoolean, String[] paramArrayOfString)
  {
    String[] arrayOfString;
    if (paramArrayOfString != null)
    {
      arrayOfString = paramArrayOfString;
      if (paramArrayOfString.length != 0);
    }
    else
    {
      arrayOfString = ((b)param_Model).getKeys();
    }
    return super.b(param_Model, paramBoolean, arrayOfString);
  }

  public final boolean b(_Model param_Model, String[] paramArrayOfString)
  {
    String[] arrayOfString;
    if (paramArrayOfString != null)
    {
      arrayOfString = paramArrayOfString;
      if (paramArrayOfString.length != 0);
    }
    else
    {
      arrayOfString = ((b)param_Model).getKeys();
    }
    return super.b(param_Model, arrayOfString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.q.c
 * JD-Core Version:    0.6.2
 */