package babkin.commande.listcommands;

import babkin.commande.baseclasses.Stereo;
import babkin.commande.interfaces.ICommand;

public class StereoOffCommand implements ICommand {
    private Stereo stereo;
    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.off();
    }
}
