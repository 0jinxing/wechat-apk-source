package com.tencent.liteav.audio.impl.Play;

class d$a extends Thread
{
  volatile boolean b = false;

  public d$a(d paramd, String paramString)
  {
    super(paramString);
  }

  public void a()
  {
    this.b = true;
  }

  public void b()
  {
    this.b = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Play.d.a
 * JD-Core Version:    0.6.2
 */