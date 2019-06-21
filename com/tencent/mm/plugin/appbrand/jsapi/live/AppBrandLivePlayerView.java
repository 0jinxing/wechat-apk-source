package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener;
import com.tencent.rtmp.ui.TXCloudVideoView;

public class AppBrandLivePlayerView extends TXCloudVideoView
{
  k hLb;
  AppBrandLivePlayerView.a hLc;
  private AppBrandLivePlayerView.c hLd;
  int hLe;
  boolean hLf;
  private AppBrandLivePlayerView.b hLg;

  public AppBrandLivePlayerView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(96048);
    init(paramContext);
    AppMethodBeat.o(96048);
  }

  public AppBrandLivePlayerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(96049);
    init(paramContext);
    AppMethodBeat.o(96049);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(96054);
    this.hLb = new k(paramContext);
    AppMethodBeat.o(96054);
  }

  public final boolean Bc(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(96050);
    paramString = this.hLb.Bd(paramString);
    ab.i("MicroMsg.AppBrandLivePlayerView", "onOperate code:%d info:%s", new Object[] { Integer.valueOf(paramString.errorCode), paramString.hLF });
    if (paramString.errorCode == 0)
      AppMethodBeat.o(96050);
    while (true)
    {
      return bool;
      AppMethodBeat.o(96050);
      bool = false;
    }
  }

  final void dZ(boolean paramBoolean)
  {
    AppMethodBeat.i(96053);
    if ((this.hLf) && (this.hLd != null))
      this.hLd.i(paramBoolean, this.hLe);
    AppMethodBeat.o(96053);
  }

  public final void om(int paramInt)
  {
    AppMethodBeat.i(96052);
    Object localObject = this.hLb;
    ab.i("TXLivePlayerJSAdapter", "enterBackground");
    if (((paramInt == 2) && (!((k)localObject).hLX)) || ((paramInt == 1) && (!((k)localObject).hLW)))
    {
      ((k)localObject).hLO = false;
      localObject = new i();
    }
    while (true)
    {
      ab.i("MicroMsg.AppBrandLivePlayerView", "onBackground code:%d info:%s", new Object[] { Integer.valueOf(((i)localObject).errorCode), ((i)localObject).hLF });
      AppMethodBeat.o(96052);
      return;
      ((k)localObject).hLO = ((k)localObject).hLJ.isPlaying();
      if (((k)localObject).hLO)
      {
        if ((((k)localObject).hLf) && (((k)localObject).hLK != null))
          ((k)localObject).hLK.onPlayEvent(6000, new Bundle());
        localObject = ((k)localObject).Bd("pause");
      }
      else
      {
        localObject = new i();
      }
    }
  }

  public final void onExit()
  {
    AppMethodBeat.i(96051);
    Object localObject = this.hLb;
    if (!((k)localObject).mInited);
    for (localObject = new i(-3, "uninited livePlayer"); ; localObject = new i())
    {
      ab.i("MicroMsg.AppBrandLivePlayerView", "onDestroy code:%d info:%s", new Object[] { Integer.valueOf(((i)localObject).errorCode), ((i)localObject).hLF });
      if (this.hLg != null)
        this.hLg.aDG();
      AppMethodBeat.o(96051);
      return;
      ((k)localObject).hLJ.stopPlay(true);
      ((k)localObject).hLJ.setPlayListener(null);
      ((k)localObject).mInited = false;
    }
  }

  public void setExitListener(AppBrandLivePlayerView.b paramb)
  {
    this.hLg = paramb;
  }

  public void setFullScreenDelegate(AppBrandLivePlayerView.a parama)
  {
    this.hLc = parama;
  }

  public void setNeedEvent(boolean paramBoolean)
  {
    this.hLf = paramBoolean;
  }

  public void setOnFullScreenChangeListener(AppBrandLivePlayerView.c paramc)
  {
    this.hLd = paramc;
  }

  public void setPlayEventListener(ITXLivePlayListener paramITXLivePlayListener)
  {
    this.hLb.hLK = paramITXLivePlayListener;
  }

  public void setSnapshotListener(TXLivePlayer.ITXSnapshotListener paramITXSnapshotListener)
  {
    this.hLb.hLL = paramITXSnapshotListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePlayerView
 * JD-Core Version:    0.6.2
 */