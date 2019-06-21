package com.tencent.mm.at.a.c;

import java.util.concurrent.Executor;

public abstract interface h extends Executor
{
  public abstract boolean DA();

  public abstract boolean isShutdown();

  public abstract void pause();

  public abstract void remove(Object paramObject);

  public abstract void resume();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.c.h
 * JD-Core Version:    0.6.2
 */