package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> 6f076a5820cc5cf4f6d105f0735bbef2d2624af7
