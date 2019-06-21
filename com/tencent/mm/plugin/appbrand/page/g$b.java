package com.tencent.mm.plugin.appbrand.page;

abstract class g$b
  implements Runnable
{
  private boolean irt = false;
  boolean xH = false;

  public abstract void aJi();

  public void run()
  {
    int i;
    if ((!this.irt) && (!this.xH))
    {
      i = 1;
      if (i != 0)
        break label26;
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label26: this.irt = true;
      aJi();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.g.b
 * JD-Core Version:    0.6.2
 */