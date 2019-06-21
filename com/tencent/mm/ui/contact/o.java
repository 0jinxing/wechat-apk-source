package com.tencent.mm.ui.contact;

import java.util.List;

public abstract class o extends n
{
  protected List<String> elZ;
  protected boolean znm;

  public o(l paraml, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paraml, paramList, paramBoolean1, paramBoolean2, 0);
  }

  public o(l paraml, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    this(paraml, paramList, paramBoolean1, paramBoolean2, paramInt, false);
  }

  private o(l paraml, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2, int paramInt, boolean paramBoolean3)
  {
    super(paraml, paramBoolean2, paramInt, paramBoolean3);
    this.elZ = paramList;
    this.znm = paramBoolean1;
  }

  public o(l paraml, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this(paraml, paramList, paramBoolean1, paramBoolean2, 0, paramBoolean3);
  }

  public int arM(String paramString)
  {
    return -1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.o
 * JD-Core Version:    0.6.2
 */