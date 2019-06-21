package com.tencent.mm.loader.h.a;

public final class a<T>
{
  protected b eRV;
  protected T value;

  public a(c paramc)
  {
    this.value = paramc;
    this.eRV = b.eRZ;
  }

  public a(String paramString)
  {
    this.value = paramString;
    this.eRV = b.eRZ;
  }

  private a(String paramString, b paramb)
  {
    this.value = paramString;
    this.eRV = paramb;
  }

  public static <T extends String> a<T> a(T paramT, b paramb)
  {
    return new a(paramT, paramb);
  }

  public final b Uf()
  {
    return this.eRV;
  }

  public final boolean Ug()
  {
    if (this.value != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String Uh()
  {
    return this.value.toString();
  }

  public final boolean equals(Object paramObject)
  {
    if ((this.value != null) && ((paramObject instanceof a)));
    for (boolean bool = this.value.equals(((a)paramObject).value); ; bool = super.equals(paramObject))
      return bool;
  }

  public final int hashCode()
  {
    if (this.value != null);
    for (int i = this.value.hashCode(); ; i = super.hashCode())
      return i;
  }

  public final String toString()
  {
    String str;
    if (this.value == null)
      str = "";
    while (true)
    {
      return str;
      if ((this.value instanceof c))
        str = ((c)this.value).Ui();
      else
        str = this.value.toString();
    }
  }

  public final T value()
  {
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.h.a.a
 * JD-Core Version:    0.6.2
 */