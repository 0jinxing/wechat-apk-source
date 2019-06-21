package com.tencent.mm.plugin.gallery.model;

import java.util.LinkedList;

public abstract interface i
{
  public abstract LinkedList<GalleryItem.MediaItem> a(String paramString, int paramInt, i.d paramd, long paramLong);

  public abstract LinkedList<GalleryItem.AlbumItem> bBS();

  public abstract void bBT();

  public abstract void bBV();

  public static abstract interface c
  {
    public abstract void c(LinkedList<GalleryItem.MediaItem> paramLinkedList, long paramLong);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.i
 * JD-Core Version:    0.6.2
 */